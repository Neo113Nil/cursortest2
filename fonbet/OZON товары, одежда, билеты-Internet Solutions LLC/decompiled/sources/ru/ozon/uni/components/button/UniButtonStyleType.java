package ru.ozon.uni.components.button;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fBO\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\u0082\u0001\b !\"#$%&'¨\u0006("}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType;", "", "Lru/ozon/uni/utils/DeferredBrush;", "titleTextColor", "subtitleTextColor", "dataTextColor", "backgroundColor", "Lru/ozon/uni/utils/DeferredColor;", "backgroundColorActive", "iconColor", "dataBackgroundColor", "gradientIconColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Object;", "getTitleTextColor-QAoP-dQ$uni_release", "()Ljava/lang/Object;", "getSubtitleTextColor-QAoP-dQ$uni_release", "getDataTextColor-QAoP-dQ$uni_release", "getBackgroundColor-QAoP-dQ$uni_release", "getBackgroundColorActive-JRM_eKU$uni_release", "getIconColor-e_QkOiY$uni_release", "getDataBackgroundColor-e_QkOiY$uni_release", "getGradientIconColor-qjDVYWU$uni_release", "Disabled", "ActionPrimary", "ActionSecondary", "AccentPrimary", "AccentSecondary", "NeutralSecondary", "Negative", "Custom", "Lru/ozon/uni/components/button/UniButtonStyleType$AccentPrimary;", "Lru/ozon/uni/components/button/UniButtonStyleType$AccentSecondary;", "Lru/ozon/uni/components/button/UniButtonStyleType$ActionPrimary;", "Lru/ozon/uni/components/button/UniButtonStyleType$ActionSecondary;", "Lru/ozon/uni/components/button/UniButtonStyleType$Custom;", "Lru/ozon/uni/components/button/UniButtonStyleType$Disabled;", "Lru/ozon/uni/components/button/UniButtonStyleType$Negative;", "Lru/ozon/uni/components/button/UniButtonStyleType$NeutralSecondary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniButtonStyleType {

    @NotNull
    private final Object backgroundColor;
    private final Object backgroundColorActive;

    @NotNull
    private final Object dataBackgroundColor;

    @NotNull
    private final Object dataTextColor;
    private final Object gradientIconColor;

    @NotNull
    private final Object iconColor;

    @NotNull
    private final Object subtitleTextColor;

    @NotNull
    private final Object titleTextColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$AccentPrimary;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentPrimary extends UniButtonStyleType {

        @NotNull
        public static final AccentPrimary INSTANCE = new AccentPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentPrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextLightKey()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextLightKey()), r6, r7, DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicPrimaryOnDark()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getClearLightKey400()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgAccentPrimary());
            Object m3262constructorimpl = DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getTextLightKey());
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentPrimary);
        }

        public int hashCode() {
            return 268761454;
        }

        @NotNull
        public String toString() {
            return "AccentPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$AccentSecondary;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentSecondary extends UniButtonStyleType {

        @NotNull
        public static final AccentSecondary INSTANCE = new AccentSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AccentSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextAccent()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextAccent()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextAccent()), r6, r7, DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicAccentPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgAccentSecondary()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgAccentSecondary());
            Object m3262constructorimpl = DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getTextAccent());
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AccentSecondary);
        }

        public int hashCode() {
            return 1606365664;
        }

        @NotNull
        public String toString() {
            return "AccentSecondary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$ActionPrimary;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPrimary extends UniButtonStyleType {

        @NotNull
        public static final ActionPrimary INSTANCE = new ActionPrimary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionPrimary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextPrimaryDynamic()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextPrimaryDynamic()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextPrimaryDynamic()), r6, r7, DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicSecondaryDynamic()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgSecondaryDynamic()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgActionPrimary());
            Object m3262constructorimpl = DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getTextPrimaryDynamic());
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionPrimary);
        }

        public int hashCode() {
            return -380109182;
        }

        @NotNull
        public String toString() {
            return "ActionPrimary";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$ActionSecondary;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionSecondary extends UniButtonStyleType {

        @NotNull
        public static final ActionSecondary INSTANCE = new ActionSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ActionSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextAction()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextAction()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextAction()), r6, r7, DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicActionPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActionSecondary()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgActionSecondary());
            Object m3262constructorimpl = DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getTextAction());
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionSecondary);
        }

        public int hashCode() {
            return 811942388;
        }

        @NotNull
        public String toString() {
            return "ActionSecondary";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBC\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u000fBM\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0010\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\u000e\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$Custom;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "Lru/ozon/uni/utils/DeferredBrush;", "backgroundColor", "titleTextColor", "subtitleTextColor", "dataTextColor", "Lru/ozon/uni/utils/DeferredColor;", "backgroundColorActive", "iconColor", "dataBackgroundColor", "gradientIconColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ll1/Z;", "(JJJJLl1/Z;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ll1/Q;", "(Ll1/Q;Ll1/Q;Ll1/Q;Ll1/Q;Ll1/Z;JJLl1/Q;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Custom extends UniButtonStyleType {
        public /* synthetic */ Custom(long j11, long j12, long j13, long j14, C7807Z c7807z, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, j13, j14, c7807z, j15, j16);
        }

        public /* synthetic */ Custom(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }

        public /* synthetic */ Custom(AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, AbstractC7799Q abstractC7799Q3, AbstractC7799Q abstractC7799Q4, C7807Z c7807z, long j11, long j12, AbstractC7799Q abstractC7799Q5, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC7799Q, abstractC7799Q2, abstractC7799Q3, abstractC7799Q4, c7807z, j11, j12, abstractC7799Q5);
        }

        public /* synthetic */ Custom(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, obj2, obj3, obj4, obj5, obj6, obj7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : obj8, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Custom(Object backgroundColor, Object titleTextColor, Object subtitleTextColor, Object dataTextColor, Object obj, Object iconColor, Object dataBackgroundColor, Object obj2) {
            super(titleTextColor, subtitleTextColor, dataTextColor, backgroundColor, obj, iconColor, dataBackgroundColor, obj2, null);
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(titleTextColor, "titleTextColor");
            Intrinsics.checkNotNullParameter(subtitleTextColor, "subtitleTextColor");
            Intrinsics.checkNotNullParameter(dataTextColor, "dataTextColor");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            Intrinsics.checkNotNullParameter(dataBackgroundColor, "dataBackgroundColor");
        }

        private Custom(long j11, long j12, long j13, long j14, C7807Z c7807z, long j15, long j16) {
            this(DeferredBrush.m3253constructorimpl(j11), DeferredBrush.m3253constructorimpl(j12), DeferredBrush.m3253constructorimpl(j13), DeferredBrush.m3253constructorimpl(j14), c7807z != null ? DeferredColor.m3260constructorimpl(c7807z.w()) : null, DeferredColor.m3260constructorimpl(j15), DeferredColor.m3260constructorimpl(j16), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        private Custom(AbstractC7799Q backgroundColor, AbstractC7799Q titleTextColor, AbstractC7799Q subtitleTextColor, AbstractC7799Q dataTextColor, C7807Z c7807z, long j11, long j12, AbstractC7799Q abstractC7799Q) {
            this(DeferredBrush.m3255constructorimpl(backgroundColor), DeferredBrush.m3255constructorimpl(titleTextColor), DeferredBrush.m3255constructorimpl(subtitleTextColor), DeferredBrush.m3255constructorimpl(dataTextColor), c7807z != null ? DeferredColor.m3260constructorimpl(c7807z.w()) : null, DeferredColor.m3260constructorimpl(j11), DeferredColor.m3260constructorimpl(j12), abstractC7799Q != null ? DeferredBrush.m3255constructorimpl(abstractC7799Q) : null, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(titleTextColor, "titleTextColor");
            Intrinsics.checkNotNullParameter(subtitleTextColor, "subtitleTextColor");
            Intrinsics.checkNotNullParameter(dataTextColor, "dataTextColor");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$Disabled;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disabled extends UniButtonStyleType {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Disabled() {
            super(r3, r4, r5, r6, DeferredColor.m3260constructorimpl(r7), DeferredColor.m3263constructorimpl(r0.getColorTokens().getGraphicTertiary(), 0.4f), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgSecondary()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            long j11;
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgSecondary());
            Object m3257constructorimpl = DeferredBrush.m3257constructorimpl(uniTheme.getColorTokens().getTextPrimary(), 0.4f);
            Object m3257constructorimpl2 = DeferredBrush.m3257constructorimpl(uniTheme.getColorTokens().getTextPrimary(), 0.4f);
            Object m3257constructorimpl3 = DeferredBrush.m3257constructorimpl(uniTheme.getColorTokens().getTextPrimary(), 0.4f);
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return -187812570;
        }

        @NotNull
        public String toString() {
            return "Disabled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$Negative;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Negative extends UniButtonStyleType {

        @NotNull
        public static final Negative INSTANCE = new Negative();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Negative() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextNegative()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextNegative()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextNegative()), r6, r7, DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicNegativePrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgNegativeSecondary()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgNegativeSecondary());
            Object m3262constructorimpl = DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getTextNegative());
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Negative);
        }

        public int hashCode() {
            return 462358239;
        }

        @NotNull
        public String toString() {
            return "Negative";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/button/UniButtonStyleType$NeutralSecondary;", "Lru/ozon/uni/components/button/UniButtonStyleType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeutralSecondary extends UniButtonStyleType {

        @NotNull
        public static final NeutralSecondary INSTANCE = new NeutralSecondary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private NeutralSecondary() {
            super(DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextPrimary()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextPrimary()), DeferredBrush.m3256constructorimpl(r0.getColorTokens().getTextPrimary()), r6, r7, DeferredColor.m3262constructorimpl(r0.getColorTokens().getGraphicTertiary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgSecondary()), null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
            UniTheme uniTheme = UniTheme.INSTANCE;
            Object m3256constructorimpl = DeferredBrush.m3256constructorimpl(uniTheme.getColorTokens().getBgSecondary());
            Object m3262constructorimpl = DeferredColor.m3262constructorimpl(uniTheme.getColorTokens().getTextPrimary());
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeutralSecondary);
        }

        public int hashCode() {
            return 1928311831;
        }

        @NotNull
        public String toString() {
            return "NeutralSecondary";
        }
    }

    public /* synthetic */ UniButtonStyleType(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @NotNull
    /* renamed from: getBackgroundColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getBackgroundColorActive-JRM_eKU$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColorActive() {
        return this.backgroundColorActive;
    }

    @NotNull
    /* renamed from: getDataBackgroundColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    @NotNull
    /* renamed from: getDataTextColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getDataTextColor() {
        return this.dataTextColor;
    }

    /* renamed from: getGradientIconColor-qjDVYWU$uni_release, reason: not valid java name and from getter */
    public final Object getGradientIconColor() {
        return this.gradientIconColor;
    }

    @NotNull
    /* renamed from: getIconColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: getSubtitleTextColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    @NotNull
    /* renamed from: getTitleTextColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getTitleTextColor() {
        return this.titleTextColor;
    }

    private UniButtonStyleType(Object titleTextColor, Object subtitleTextColor, Object dataTextColor, Object backgroundColor, Object obj, Object iconColor, Object dataBackgroundColor, Object obj2) {
        Intrinsics.checkNotNullParameter(titleTextColor, "titleTextColor");
        Intrinsics.checkNotNullParameter(subtitleTextColor, "subtitleTextColor");
        Intrinsics.checkNotNullParameter(dataTextColor, "dataTextColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(dataBackgroundColor, "dataBackgroundColor");
        this.titleTextColor = titleTextColor;
        this.subtitleTextColor = subtitleTextColor;
        this.dataTextColor = dataTextColor;
        this.backgroundColor = backgroundColor;
        this.backgroundColorActive = obj;
        this.iconColor = iconColor;
        this.dataBackgroundColor = dataBackgroundColor;
        this.gradientIconColor = obj2;
    }

    public /* synthetic */ UniButtonStyleType(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4, obj5, obj6, obj7, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : obj8, null);
    }
}
