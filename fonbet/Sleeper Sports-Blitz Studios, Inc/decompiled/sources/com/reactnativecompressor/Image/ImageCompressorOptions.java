package com.reactnativecompressor.Image;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import fr.greweb.reactnativeviewshot.ViewShot;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.SpanContext;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ImageCompressorOptions.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 A2\u00020\u0001:\u0005=>?@AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressorOptions;", "", "<init>", "()V", "compressionMethod", "Lcom/reactnativecompressor/Image/ImageCompressorOptions$CompressionMethod;", "getCompressionMethod", "()Lcom/reactnativecompressor/Image/ImageCompressorOptions$CompressionMethod;", "setCompressionMethod", "(Lcom/reactnativecompressor/Image/ImageCompressorOptions$CompressionMethod;)V", ViewProps.MAX_WIDTH, "", "getMaxWidth", "()I", "setMaxWidth", "(I)V", ViewProps.MAX_HEIGHT, "getMaxHeight", "setMaxHeight", "progressDivider", "getProgressDivider", "()Ljava/lang/Integer;", "setProgressDivider", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "quality", "", "getQuality", "()F", "setQuality", "(F)V", MetricTracker.Object.INPUT, "Lcom/reactnativecompressor/Image/ImageCompressorOptions$InputType;", "getInput", "()Lcom/reactnativecompressor/Image/ImageCompressorOptions$InputType;", "setInput", "(Lcom/reactnativecompressor/Image/ImageCompressorOptions$InputType;)V", AgentOptions.OUTPUT, "Lcom/reactnativecompressor/Image/ImageCompressorOptions$OutputType;", "getOutput", "()Lcom/reactnativecompressor/Image/ImageCompressorOptions$OutputType;", "setOutput", "(Lcom/reactnativecompressor/Image/ImageCompressorOptions$OutputType;)V", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "returnableOutputType", "Lcom/reactnativecompressor/Image/ImageCompressorOptions$ReturnableOutputType;", "getReturnableOutputType", "()Lcom/reactnativecompressor/Image/ImageCompressorOptions$ReturnableOutputType;", "setReturnableOutputType", "(Lcom/reactnativecompressor/Image/ImageCompressorOptions$ReturnableOutputType;)V", "disablePngTransparency", "", "getDisablePngTransparency", "()Z", "setDisablePngTransparency", "(Z)V", "InputType", "OutputType", "ReturnableOutputType", "CompressionMethod", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageCompressorOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean disablePngTransparency;
    private CompressionMethod compressionMethod = CompressionMethod.auto;
    private int maxWidth = ConstantsKt.MIN_FRONT_CAMERA_WIDTH;
    private int maxHeight = ConstantsKt.MIN_FRONT_CAMERA_WIDTH;
    private Integer progressDivider = 0;
    private float quality = 0.8f;
    private InputType input = InputType.uri;
    private OutputType output = OutputType.jpg;
    private String uuid = "";
    private ReturnableOutputType returnableOutputType = ReturnableOutputType.uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageCompressorOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressorOptions$InputType;", "", "<init>", "(Ljava/lang/String;I)V", ViewShot.Results.BASE_64, "uri", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType base64 = new InputType(ViewShot.Results.BASE_64, 0);
        public static final InputType uri = new InputType("uri", 1);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{base64, uri};
        }

        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        private InputType(String str, int i) {
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageCompressorOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressorOptions$OutputType;", "", "<init>", "(Ljava/lang/String;I)V", "png", "jpg", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OutputType[] $VALUES;
        public static final OutputType png = new OutputType("png", 0);
        public static final OutputType jpg = new OutputType("jpg", 1);

        private static final /* synthetic */ OutputType[] $values() {
            return new OutputType[]{png, jpg};
        }

        public static EnumEntries<OutputType> getEntries() {
            return $ENTRIES;
        }

        private OutputType(String str, int i) {
        }

        static {
            OutputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static OutputType valueOf(String str) {
            return (OutputType) Enum.valueOf(OutputType.class, str);
        }

        public static OutputType[] values() {
            return (OutputType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageCompressorOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressorOptions$ReturnableOutputType;", "", "<init>", "(Ljava/lang/String;I)V", ViewShot.Results.BASE_64, "uri", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReturnableOutputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ReturnableOutputType[] $VALUES;
        public static final ReturnableOutputType base64 = new ReturnableOutputType(ViewShot.Results.BASE_64, 0);
        public static final ReturnableOutputType uri = new ReturnableOutputType("uri", 1);

        private static final /* synthetic */ ReturnableOutputType[] $values() {
            return new ReturnableOutputType[]{base64, uri};
        }

        public static EnumEntries<ReturnableOutputType> getEntries() {
            return $ENTRIES;
        }

        private ReturnableOutputType(String str, int i) {
        }

        static {
            ReturnableOutputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ReturnableOutputType valueOf(String str) {
            return (ReturnableOutputType) Enum.valueOf(ReturnableOutputType.class, str);
        }

        public static ReturnableOutputType[] values() {
            return (ReturnableOutputType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageCompressorOptions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressorOptions$CompressionMethod;", "", "<init>", "(Ljava/lang/String;I)V", "auto", SpanContext.DEFAULT_ORIGIN, "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompressionMethod {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CompressionMethod[] $VALUES;
        public static final CompressionMethod auto = new CompressionMethod("auto", 0);
        public static final CompressionMethod manual = new CompressionMethod(SpanContext.DEFAULT_ORIGIN, 1);

        private static final /* synthetic */ CompressionMethod[] $values() {
            return new CompressionMethod[]{auto, manual};
        }

        public static EnumEntries<CompressionMethod> getEntries() {
            return $ENTRIES;
        }

        private CompressionMethod(String str, int i) {
        }

        static {
            CompressionMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static CompressionMethod valueOf(String str) {
            return (CompressionMethod) Enum.valueOf(CompressionMethod.class, str);
        }

        public static CompressionMethod[] values() {
            return (CompressionMethod[]) $VALUES.clone();
        }
    }

    public final CompressionMethod getCompressionMethod() {
        return this.compressionMethod;
    }

    public final void setCompressionMethod(CompressionMethod compressionMethod) {
        Intrinsics.checkNotNullParameter(compressionMethod, "<set-?>");
        this.compressionMethod = compressionMethod;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final Integer getProgressDivider() {
        return this.progressDivider;
    }

    public final void setProgressDivider(Integer num) {
        this.progressDivider = num;
    }

    public final float getQuality() {
        return this.quality;
    }

    public final void setQuality(float f) {
        this.quality = f;
    }

    public final InputType getInput() {
        return this.input;
    }

    public final void setInput(InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "<set-?>");
        this.input = inputType;
    }

    public final OutputType getOutput() {
        return this.output;
    }

    public final void setOutput(OutputType outputType) {
        Intrinsics.checkNotNullParameter(outputType, "<set-?>");
        this.output = outputType;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final ReturnableOutputType getReturnableOutputType() {
        return this.returnableOutputType;
    }

    public final void setReturnableOutputType(ReturnableOutputType returnableOutputType) {
        Intrinsics.checkNotNullParameter(returnableOutputType, "<set-?>");
        this.returnableOutputType = returnableOutputType;
    }

    public final boolean getDisablePngTransparency() {
        return this.disablePngTransparency;
    }

    public final void setDisablePngTransparency(boolean z) {
        this.disablePngTransparency = z;
    }

    /* compiled from: ImageCompressorOptions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/reactnativecompressor/Image/ImageCompressorOptions$Companion;", "", "<init>", "()V", "fromMap", "Lcom/reactnativecompressor/Image/ImageCompressorOptions;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final ImageCompressorOptions fromMap(ReadableMap map) {
            Intrinsics.checkNotNullParameter(map, "map");
            ImageCompressorOptions imageCompressorOptions = new ImageCompressorOptions();
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                switch (nextKey.hashCode()) {
                    case -1524972519:
                        if (!nextKey.equals("disablePngTransparency")) {
                            break;
                        } else {
                            imageCompressorOptions.setDisablePngTransparency(map.getBoolean(nextKey));
                            break;
                        }
                    case -1005512447:
                        if (!nextKey.equals(AgentOptions.OUTPUT)) {
                            break;
                        } else {
                            String string = map.getString(nextKey);
                            Intrinsics.checkNotNull(string);
                            imageCompressorOptions.setOutput(OutputType.valueOf(string));
                            break;
                        }
                    case -906066005:
                        if (!nextKey.equals(ViewProps.MAX_HEIGHT)) {
                            break;
                        } else {
                            imageCompressorOptions.setMaxHeight(map.getInt(nextKey));
                            break;
                        }
                    case 3601339:
                        if (!nextKey.equals("uuid")) {
                            break;
                        } else {
                            imageCompressorOptions.setUuid(map.getString(nextKey));
                            break;
                        }
                    case 100358090:
                        if (!nextKey.equals(MetricTracker.Object.INPUT)) {
                            break;
                        } else {
                            String string2 = map.getString(nextKey);
                            Intrinsics.checkNotNull(string2);
                            imageCompressorOptions.setInput(InputType.valueOf(string2));
                            break;
                        }
                    case 291107303:
                        if (!nextKey.equals("compressionMethod")) {
                            break;
                        } else {
                            String string3 = map.getString(nextKey);
                            Intrinsics.checkNotNull(string3);
                            imageCompressorOptions.setCompressionMethod(CompressionMethod.valueOf(string3));
                            break;
                        }
                    case 400381634:
                        if (!nextKey.equals(ViewProps.MAX_WIDTH)) {
                            break;
                        } else {
                            imageCompressorOptions.setMaxWidth(map.getInt(nextKey));
                            break;
                        }
                    case 583437356:
                        if (!nextKey.equals("progressDivider")) {
                            break;
                        } else {
                            imageCompressorOptions.setProgressDivider(Integer.valueOf(map.getInt(nextKey)));
                            break;
                        }
                    case 651215103:
                        if (!nextKey.equals("quality")) {
                            break;
                        } else {
                            imageCompressorOptions.setQuality((float) map.getDouble(nextKey));
                            break;
                        }
                    case 1418077701:
                        if (!nextKey.equals("returnableOutputType")) {
                            break;
                        } else {
                            String string4 = map.getString(nextKey);
                            Intrinsics.checkNotNull(string4);
                            imageCompressorOptions.setReturnableOutputType(ReturnableOutputType.valueOf(string4));
                            break;
                        }
                }
            }
            return imageCompressorOptions;
        }
    }
}
