package com.reactnativecompressor.Audio;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.naman14.androidlame.AndroidLame;
import com.naman14.androidlame.LameBuilder;
import com.naman14.androidlame.WaveReader;
import com.reactnativecompressor.Audio.AudioCompressor;
import com.reactnativecompressor.Audio.AudioHelper;
import com.reactnativecompressor.Utils.MediaCache;
import com.reactnativecompressor.Utils.Utils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javazoom.jl.converter.Converter;
import javazoom.jl.decoder.JavaLayerException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* compiled from: AudioCompressor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/reactnativecompressor/Audio/AudioCompressor;", "", "<init>", "()V", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AudioCompressor {
    private static final int OUTPUT_STREAM_BUFFER = 8192;
    private static BufferedOutputStream outputStream;
    private static WaveReader waveReader;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "AudioMain";

    @JvmStatic
    public static final void CompressAudio(String str, ReadableMap readableMap, ReactApplicationContext reactApplicationContext, Promise promise) {
        INSTANCE.CompressAudio(str, readableMap, reactApplicationContext, promise);
    }

    /* compiled from: AudioCompressor.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007JB\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\"H\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/reactnativecompressor/Audio/AudioCompressor$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "OUTPUT_STREAM_BUFFER", "", "outputStream", "Ljava/io/BufferedOutputStream;", "getOutputStream", "()Ljava/io/BufferedOutputStream;", "setOutputStream", "(Ljava/io/BufferedOutputStream;)V", "waveReader", "Lcom/naman14/androidlame/WaveReader;", "getWaveReader", "()Lcom/naman14/androidlame/WaveReader;", "setWaveReader", "(Lcom/naman14/androidlame/WaveReader;)V", "CompressAudio", "", "fileUrl", "optionMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "autoCompressHelper", "actualFileUrl", "completeCallback", "Lkotlin/Function2;", "", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG() {
            return AudioCompressor.TAG;
        }

        public final BufferedOutputStream getOutputStream() {
            return AudioCompressor.outputStream;
        }

        public final void setOutputStream(BufferedOutputStream bufferedOutputStream) {
            AudioCompressor.outputStream = bufferedOutputStream;
        }

        public final WaveReader getWaveReader() {
            return AudioCompressor.waveReader;
        }

        public final void setWaveReader(WaveReader waveReader) {
            AudioCompressor.waveReader = waveReader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v5 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r13v9, types: [kotlin.jvm.internal.Ref$ObjectRef] */
        @JvmStatic
        public final void CompressAudio(final String fileUrl, ReadableMap optionMap, ReactApplicationContext context, Promise promise) {
            Ref.ObjectRef objectRef;
            final Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            final Promise promise2 = promise;
            Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
            Intrinsics.checkNotNullParameter(optionMap, "optionMap");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(promise2, "promise");
            ?? realPath = Utils.getRealPath(fileUrl, context, new Object[0]);
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            objectRef4.element = realPath;
            Intrinsics.checkNotNull(realPath);
            ?? replace$default = StringsKt.replace$default((String) realPath, "file://", "", false, 4, (Object) null);
            try {
                final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                objectRef5.element = replace$default;
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                objectRef = 1;
                try {
                    if (StringsKt.endsWith(fileUrl, ".mp4", true)) {
                        Utils.INSTANCE.addLog("mp4 file found");
                        String generateCacheFilePath = Utils.generateCacheFilePath("mp3", context);
                        objectRef2 = objectRef4;
                        try {
                            objectRef = objectRef2;
                            new AudioExtractor().genVideoUsingMuxer(fileUrl, generateCacheFilePath, -1, -1, true, false);
                            objectRef.element = Utils.INSTANCE.slashifyFilePath(generateCacheFilePath);
                            objectRef5.element = Utils.generateCacheFilePath("wav", context);
                            try {
                                new Converter().convert(generateCacheFilePath, (String) objectRef5.element);
                            } catch (JavaLayerException e) {
                                Utils.INSTANCE.addLog("JavaLayerException error" + e.getLocalizedMessage());
                                e.printStackTrace();
                            }
                            booleanRef.element = true;
                            objectRef3 = objectRef;
                            String str = (String) objectRef5.element;
                            objectRef2 = objectRef3;
                        } catch (Exception unused) {
                            objectRef = objectRef2;
                            promise2.resolve(objectRef.element);
                        }
                        try {
                            Function2 function2 = new Function2() { // from class: com.reactnativecompressor.Audio.AudioCompressor$Companion$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit CompressAudio$lambda$0;
                                    CompressAudio$lambda$0 = AudioCompressor.Companion.CompressAudio$lambda$0(fileUrl, booleanRef, objectRef5, promise2, objectRef2, (String) obj, ((Boolean) obj2).booleanValue());
                                    return CompressAudio$lambda$0;
                                }
                            };
                            promise2 = promise2;
                            objectRef = objectRef2;
                            autoCompressHelper(str, replace$default, optionMap, context, function2);
                        } catch (Exception unused2) {
                            promise2 = promise2;
                            objectRef = objectRef2;
                            promise2.resolve(objectRef.element);
                        }
                    }
                    objectRef = objectRef4;
                    objectRef3 = objectRef;
                    if (!StringsKt.endsWith(fileUrl, ".wav", true)) {
                        Utils.INSTANCE.addLog("non wav file found");
                        objectRef5.element = Utils.generateCacheFilePath("wav", context);
                        try {
                            new Converter().convert(replace$default, (String) objectRef5.element);
                        } catch (JavaLayerException e2) {
                            Utils.INSTANCE.addLog("JavaLayerException error" + e2.getLocalizedMessage());
                            e2.printStackTrace();
                        }
                        booleanRef.element = true;
                        objectRef3 = objectRef;
                    }
                    String str2 = (String) objectRef5.element;
                    objectRef2 = objectRef3;
                    Function2 function22 = new Function2() { // from class: com.reactnativecompressor.Audio.AudioCompressor$Companion$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit CompressAudio$lambda$0;
                            CompressAudio$lambda$0 = AudioCompressor.Companion.CompressAudio$lambda$0(fileUrl, booleanRef, objectRef5, promise2, objectRef2, (String) obj, ((Boolean) obj2).booleanValue());
                            return CompressAudio$lambda$0;
                        }
                    };
                    promise2 = promise2;
                    objectRef = objectRef2;
                    autoCompressHelper(str2, replace$default, optionMap, context, function22);
                } catch (Exception unused3) {
                    promise2.resolve(objectRef.element);
                }
            } catch (Exception unused4) {
                objectRef = objectRef4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit CompressAudio$lambda$0(String str, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Promise promise, Ref.ObjectRef objectRef2, String mp3Path, boolean z) {
            Intrinsics.checkNotNullParameter(mp3Path, "mp3Path");
            if (z) {
                String str2 = "file://" + mp3Path;
                Utils.INSTANCE.addLog("finished: " + str2);
                MediaCache.removeCompletedImagePath(str);
                if (booleanRef.element) {
                    new File((String) objectRef.element).delete();
                }
                promise.resolve(str2);
            } else {
                Utils.INSTANCE.addLog("error: " + mp3Path);
                promise.resolve(objectRef2.element);
            }
            return Unit.INSTANCE;
        }

        private final void autoCompressHelper(String fileUrl, String actualFileUrl, ReadableMap optionMap, ReactApplicationContext context, Function2<? super String, ? super Boolean, Unit> completeCallback) {
            boolean z;
            int destinationBitrateByQuality;
            int channels;
            int sampleRate;
            int read;
            AudioHelper fromMap = AudioHelper.INSTANCE.fromMap(optionMap);
            String quality = fromMap.getQuality();
            try {
                String generateCacheFilePath = Utils.generateCacheFilePath("mp3", context);
                File file = new File(fileUrl);
                File file2 = new File(generateCacheFilePath);
                Utils.INSTANCE.addLog("Initialising wav reader");
                setWaveReader(new WaveReader(file));
                try {
                    WaveReader waveReader = getWaveReader();
                    Intrinsics.checkNotNull(waveReader);
                    waveReader.openWave();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Utils.INSTANCE.addLog("Intitialising encoder");
                if (fromMap.getBitrate() != -1) {
                    destinationBitrateByQuality = fromMap.getBitrate() / 1000;
                } else {
                    AudioHelper.Companion companion = AudioHelper.INSTANCE;
                    Intrinsics.checkNotNull(quality);
                    destinationBitrateByQuality = companion.getDestinationBitrateByQuality(actualFileUrl, quality);
                    Utils.INSTANCE.addLog("dest bitrate: " + destinationBitrateByQuality);
                }
                LameBuilder lameBuilder = new LameBuilder();
                lameBuilder.setOutBitrate(destinationBitrateByQuality);
                if (fromMap.getChannels() != -1) {
                    channels = fromMap.getChannels();
                } else {
                    WaveReader waveReader2 = getWaveReader();
                    Intrinsics.checkNotNull(waveReader2);
                    channels = waveReader2.getChannels();
                }
                lameBuilder.setOutChannels(channels);
                WaveReader waveReader3 = getWaveReader();
                Intrinsics.checkNotNull(waveReader3);
                lameBuilder.setInSampleRate(waveReader3.getSampleRate());
                if (fromMap.getSamplerate() != -1) {
                    sampleRate = fromMap.getSamplerate();
                } else {
                    WaveReader waveReader4 = getWaveReader();
                    Intrinsics.checkNotNull(waveReader4);
                    sampleRate = waveReader4.getSampleRate();
                }
                lameBuilder.setOutSampleRate(sampleRate);
                AndroidLame build = lameBuilder.build();
                int i = 8192;
                try {
                    setOutputStream(new BufferedOutputStream(new FileOutputStream(file2), 8192));
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                }
                short[] sArr = new short[8192];
                short[] sArr2 = new short[8192];
                byte[] bArr = new byte[8192];
                WaveReader waveReader5 = getWaveReader();
                Intrinsics.checkNotNull(waveReader5);
                int channels2 = waveReader5.getChannels();
                Utils.INSTANCE.addLog("started encoding");
                while (true) {
                    if (channels2 != 2) {
                        WaveReader waveReader6 = getWaveReader();
                        Intrinsics.checkNotNull(waveReader6);
                        int read2 = waveReader6.read(sArr, 8192);
                        Utils.INSTANCE.addLog("bytes read=" + read2);
                        if (read2 <= 0) {
                            break;
                        }
                        int encode = build.encode(sArr, sArr, read2, bArr);
                        Utils.INSTANCE.addLog("bytes encoded=" + encode);
                        if (encode > 0) {
                            try {
                                Utils.INSTANCE.addLog("writing mp3 buffer to outputstream with " + encode + " bytes");
                                BufferedOutputStream outputStream = getOutputStream();
                                Intrinsics.checkNotNull(outputStream);
                                outputStream.write(bArr, 0, encode);
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        i = 8192;
                    } else {
                        try {
                            WaveReader waveReader7 = getWaveReader();
                            Intrinsics.checkNotNull(waveReader7);
                            read = waveReader7.read(sArr, sArr2, i);
                            Utils.INSTANCE.addLog("bytes read=" + read);
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        if (read <= 0) {
                            break;
                        }
                        int encode2 = build.encode(sArr, sArr2, read, bArr);
                        Utils.INSTANCE.addLog("bytes encoded=" + encode2);
                        if (encode2 > 0) {
                            try {
                                Utils.INSTANCE.addLog("writing mp3 buffer to outputstream with " + encode2 + " bytes");
                                BufferedOutputStream outputStream2 = getOutputStream();
                                Intrinsics.checkNotNull(outputStream2);
                                outputStream2.write(bArr, 0, encode2);
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        i = 8192;
                    }
                }
                Utils.INSTANCE.addLog("flushing final mp3buffer");
                int flush = build.flush(bArr);
                Utils.INSTANCE.addLog("flushed " + flush + " bytes");
                if (flush > 0) {
                    try {
                        Utils.INSTANCE.addLog("writing final mp3buffer to outputstream");
                        BufferedOutputStream outputStream3 = getOutputStream();
                        Intrinsics.checkNotNull(outputStream3);
                        outputStream3.write(bArr, 0, flush);
                        Utils.INSTANCE.addLog("closing output stream");
                        BufferedOutputStream outputStream4 = getOutputStream();
                        Intrinsics.checkNotNull(outputStream4);
                        outputStream4.close();
                        String absolutePath = file2.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                        completeCallback.invoke(absolutePath, true);
                        return;
                    } catch (IOException e6) {
                        String localizedMessage = e6.getLocalizedMessage();
                        Intrinsics.checkNotNullExpressionValue(localizedMessage, "getLocalizedMessage(...)");
                        completeCallback.invoke(localizedMessage, false);
                        e6.printStackTrace();
                    }
                }
                z = false;
            } catch (IOException e7) {
                String localizedMessage2 = e7.getLocalizedMessage();
                Intrinsics.checkNotNullExpressionValue(localizedMessage2, "getLocalizedMessage(...)");
                z = false;
                completeCallback.invoke(localizedMessage2, false);
            }
            completeCallback.invoke("something went wrong", Boolean.valueOf(z));
        }
    }
}
