package gatewayprotocol.v1;

import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a+\u0010\b\u001a\u00020\r*\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a+\u0010\b\u001a\u00020\u0010*\u00020\u00102\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0012\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\r*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0010*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$Dsl;", "", "block", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "-initializestaticDeviceInfo", "(Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "copy", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$AndroidKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$IosKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Web;", "Lgatewayprotocol/v1/StaticDeviceInfoKt$WebKt$Dsl;", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Web;Lkotlin/jvm/functions/Function1;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Web;", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;", "getAndroidOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "androidOrNull", "getIosOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios;", "iosOrNull", "getWebOrNull", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfoOrBuilder;)Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Web;", "webOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticDeviceInfoKtKt {
    @NotNull
    /* renamed from: -initializestaticDeviceInfo, reason: not valid java name */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo m859initializestaticDeviceInfo(@NotNull Function1<? super StaticDeviceInfoKt.Dsl, Unit> function1) {
        function1.getClass();
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        newBuilder.getClass();
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, @NotNull Function1<? super StaticDeviceInfoKt.Dsl, Unit> function1) {
        staticDeviceInfo.getClass();
        function1.getClass();
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        builder.getClass();
        StaticDeviceInfoKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        staticDeviceInfoOrBuilder.getClass();
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        staticDeviceInfoOrBuilder.getClass();
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    @Nullable
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web getWebOrNull(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        staticDeviceInfoOrBuilder.getClass();
        if (staticDeviceInfoOrBuilder.hasWeb()) {
            return staticDeviceInfoOrBuilder.getWeb();
        }
        return null;
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, @NotNull Function1<? super StaticDeviceInfoKt.AndroidKt.Dsl, Unit> function1) {
        android2.getClass();
        function1.getClass();
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder = android2.toBuilder();
        builder.getClass();
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, @NotNull Function1<? super StaticDeviceInfoKt.IosKt.Dsl, Unit> function1) {
        ios.getClass();
        function1.getClass();
        StaticDeviceInfoKt.IosKt.Dsl.Companion companion = StaticDeviceInfoKt.IosKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = ios.toBuilder();
        builder.getClass();
        StaticDeviceInfoKt.IosKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }

    @NotNull
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Web copy(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo.Web web, @NotNull Function1<? super StaticDeviceInfoKt.WebKt.Dsl, Unit> function1) {
        web.getClass();
        function1.getClass();
        StaticDeviceInfoKt.WebKt.Dsl.Companion companion = StaticDeviceInfoKt.WebKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Web.Builder builder = web.toBuilder();
        builder.getClass();
        StaticDeviceInfoKt.WebKt.Dsl _create = companion._create(builder);
        function1.invoke(_create);
        return _create._build();
    }
}
