const canvas = __native.getGameView();
const gl = canvas.getContext("webgl");

log(canvas.width, canvas.height);

var spritevs_src = `
attribute vec4 aPosition;
attribute vec2 aTexture;
varying vec2 vTexture;
void main() {
    vTexture = aTexture;
    gl_Position = aPosition;
}
`;

var spritefs_src = `
precision mediump float;
varying vec2 vTexture;
uniform sampler2D u_texture;
void main() {
    gl_FragColor = texture2D(u_texture, vTexture);
}
`;

var program;
var positionAttributeLocation;
var vertexBuffer;
var positions;
var aPosition;
var aTexture;
var uTexture;
var owl;
var video;

function _GLStart() {
	vshaderid = gl.createShader(gl.VERTEX_SHADER);
	fshaderid = gl.createShader(gl.FRAGMENT_SHADER);
	compileShader(0,vshaderid,spritevs_src);
	compileShader(1,fshaderid,spritefs_src);
	program = gl.createProgram();
	gl.attachShader(program, vshaderid);
	gl.attachShader(program, fshaderid);
	gl.linkProgram(program);

    vertexBuffer = gl.createBuffer(1);

    aPosition = gl.getAttribLocation(program, "aPosition");
    aTexture = gl.getAttribLocation(program, "aTexture");
    uTexture = gl.getUniformLocation(program, "u_texture");

    gl.enable(gl.BLEND);
    gl.blendFunc(gl.SRC_ALPHA, gl.ONE_MINUS_SRC_ALPHA);
    gl.useProgram(program);

    gl.uniform1i(uTexture, 0);

    gl.enableVertexAttribArray(aPosition);
    gl.enableVertexAttribArray(aTexture);

    gl.activeTexture(gl.TEXTURE0);

    owl = initTexture(gl,"public/assets/images/owl.png", true, false);

	log("program", program, "buffer", vertexBuffer, "locations", aPosition, aTexture, uTexture);
	log("owl texture", owl);

	gl.viewport(0, 0, canvas.width,canvas.height);
	gl.bindTexture(gl.TEXTURE_2D, owl);

    /*const url = "http://preprod-cdn.playtika.com/playtika/vs_fb_en_haxe/assets/cid_722.3_480-7061-14730338.1/480W/games/game415/slot/icons/5.11616.18386/en/anim_60_expanding_wild_2_1.webm";
                __native.preloadResource(url, 3, () => {
                    video = __native.openResource(url, 3);

                    __native.log("Video::Source", video);

                    video.play();

                    setTimeout(() => {
                        video.pause();

                        setTimeout(() => {
                            video.play();
                        }, 2000);
                    }, 2000);
                });*/
}


function DrawFrame() {
    //if (video) {
    //    gl.texImage2D(gl.TEXTURE_2D, 0, gl.RGBA, video.videoWidth, video.videoHeight, 0, gl.RGBA, gl.UNSIGNED_BYTE, video);
    //}

	window.requestAnimationFrame(DrawFrame);

	gl.clearColor(0, 0, 0, 1);
	gl.clear(gl.COLOR_BUFFER_BIT);
	gl.useProgram(program);

    gl.bindTexture(gl.TEXTURE_2D, owl);
    gl.bindBuffer(gl.ARRAY_BUFFER, vertexBuffer);

    const scale = canvas.height / 602;
    const offsetX = ((canvas.width - (640 * scale)) / canvas.width);

    let posX1 = -(1 - offsetX);
    let posY1 = -1;
    let posX2 = (1 - offsetX);
    let posY2 = 1;

    let u1 = 0;
    let u2 = 1;
    let v1 = 1;
    let v2 = 0;

    let vertices = new Float32Array([
        posX1, posY1, u1, v1,
        posX2, posY1, u2, v1,
        posX1, posY2, u1, v2,
        posX1, posY2, u1, v2,
        posX2, posY1, u2, v1,
        posX2, posY2, u2, v2,
    ]);

    let vertexCount = 24;

    gl.bufferData(gl.ARRAY_BUFFER, vertices, gl.DYNAMIC_DRAW);

    gl.vertexAttribPointer(aPosition, 2, gl.FLOAT, gl.FALSE, 4 * 4, 0);
    gl.vertexAttribPointer(aTexture, 2, gl.FLOAT, gl.FALSE, 4 * 4, 4 * 2);

    gl.drawArrays(gl.TRIANGLES, 0, vertexCount);
    gl.bindTexture(gl.TEXTURE_2D, 0);


}

__onFrame = DrawFrame;

function compileShader(type,shader,shader_src) {
	gl.shaderSource(shader, shader_src);
	gl.compileShader(shader);
	if (!gl.getShaderParameter(shader, gl.COMPILE_STATUS)) {
		throw "shader "+type+" compile error: "+gl.getShaderInfoLog(shader);
	}
}

function initTexture(gl,imageurl,smooth,wrap) {
	var texture = gl.createTexture();

    __preloadResource(imageurl, 1, () => {
        const image = __openResource(imageurl, 1);

        gl.bindTexture(gl.TEXTURE_2D, texture);
		gl.texImage2D(gl.TEXTURE_2D, 0, gl.RGBA, image.width, image.height, 0, gl.RGBA, gl.UNSIGNED_BYTE, image.id);

		if (smooth) {
			gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MAG_FILTER, gl.LINEAR);
			gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MIN_FILTER, gl.LINEAR);
		} else {
			gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MAG_FILTER, gl.NEAREST);
			gl.texParameteri(gl.TEXTURE_2D, gl.TEXTURE_MIN_FILTER, gl.NEAREST);
		}
		if (wrap) {
			gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_WRAP_S, gl.REPEAT);
			gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_WRAP_T, gl.REPEAT);
		} else {
			gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_WRAP_S, gl.CLAMP_TO_EDGE);
			gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_WRAP_T, gl.CLAMP_TO_EDGE);
		}
		gl.bindTexture(gl.TEXTURE_2D, null);
    });

	return texture;
}

_GLStart();
    gl.clear(gl.COLOR_BUFFER_BIT);

	window.requestAnimationFrame(DrawFrame);
}

__onFrame = DrawFrame;


//
// // WebSocket Constructors:
//
////const ws = new WebSocket("ws://192.168.31.24/");
////const ws = new WebSocket("ws://10.62.44.125:8005");
////const ws = new WebSocket("ws://192.168.31.24:8005");
////const ws = new WebSocket("wss://echo.websocket.org");
////const ws = new WebSocket("wss://ws.gate.io/v3");
//const ws = new WebSocket("wss://javascript.info/article/websocket/demo/hello", "protocol");
//const ws = new WebSocket("wss://javascript.info/article/websocket/demo/hello");
//const ws = new WebSocket("wss://javascript.info/article/websocket/demo/hello", ["protocol1", "protocol2"]);
//
//
//
////const ws = new WebSocket("wss://sm-preprod-api-dsa.playtika.com/MessagingService/messages/v2?sessionId=4895782230142834001&userId=151326012390815&clientType=225&clientVersion=77.25.00&stomp_please=/v2");
//
////WebSocket Set properties
//
//ws.onerror = function(){
//    log("on error triggered ws.readyState " + ws.readyState);
//
//}
//ws.onopen = function(){
//    log("on open triggered ws.readyState " + ws.readyState);
//    ws.send("Hello webserver!Hello webserver!");
//}
//ws.onmessage = function(event){
//    log("on onmessage triggered ws.readyState " + ws.readyState);
//    log("msg=" + event.data);
//    ws.close();
//}
//ws.onclose = function(){
//    log("on onclose triggered ws.readyState " + ws.readyState);
//}
//
//ws.binaryType = "blob";
////WebSocket Set read-only properties
//ws.url = "";
//ws.bufferedAmount = 0;
//ws.extensions = "";
//ws.readyState = 0;
//ws.protocol = "";
//
////WebSocket new properties
//ws.xxx = "xxx";
//
////WebSocket Get properties
//
//log(ws.onerror);
//log(ws.onopen);
//log(ws.onmessage);
//log(ws.onclose);
//log(ws.binaryType);
//log(ws.url);
//log(ws.bufferedAmount);
//log(ws.extensions);
//log(ws.readyState);
//log(ws.protocol);
//log(ws.xxx);
