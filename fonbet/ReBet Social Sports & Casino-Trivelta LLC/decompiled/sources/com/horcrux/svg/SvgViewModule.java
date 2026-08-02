package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "RNSVGSvgViewModule")
/* loaded from: classes3.dex */
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38768a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f38769b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callback f38770c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38771d;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a, reason: collision with other inner class name */
        public class RunnableC0538a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            public class RunnableC0539a implements Runnable {
                public RunnableC0539a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f38768a, aVar.f38769b, aVar.f38770c, aVar.f38771d + 1);
                }
            }

            public RunnableC0538a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f38768a);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0539a());
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f38768a, aVar.f38769b, aVar.f38770c, aVar.f38771d + 1);
            }
        }

        public a(int i10, ReadableMap readableMap, Callback callback, int i11) {
            this.f38768a = i10;
            this.f38769b = readableMap;
            this.f38770c = callback;
            this.f38771d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f38768a);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f38768a, new RunnableC0538a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.f38769b;
            if (readableMap != null) {
                this.f38770c.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f38769b.getInt("height")));
            } else {
                this.f38770c.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i10, ReadableMap readableMap, Callback callback, int i11) {
        UiThreadUtil.runOnUiThread(new a(i10, readableMap, callback, i11));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d10, ReadableMap readableMap, Callback callback) {
        toDataURL(d10.intValue(), readableMap, callback, 0);
    }
}
