package ru.ozon.uni.components.disclaimer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme;", "", "backgroundColor", "Lru/ozon/uni/utils/DeferredColor;", "textColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getBackgroundColor-e_QkOiY$uni_release", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTextColor-e_QkOiY$uni_release", "Base", "Primary", "Custom", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme$Base;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme$Custom;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme$Primary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UniDisclaimerMainButtonTheme {

    @NotNull
    private final Object backgroundColor;

    @NotNull
    private final Object textColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme$Base;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Base extends UniDisclaimerMainButtonTheme {

        @NotNull
        public static final Base INSTANCE = new Base();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Base() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgOverlap()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextPrimary()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Base);
        }

        public int hashCode() {
            return 530338938;
        }

        @NotNull
        public String toString() {
            return "Base";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme$Custom;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme;", "Lru/ozon/uni/utils/DeferredColor;", "backgroundColor", "textColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Custom extends UniDisclaimerMainButtonTheme {
        public /* synthetic */ Custom(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, obj2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Custom(Object backgroundColor, Object textColor) {
            super(backgroundColor, textColor, null);
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme$Primary;", "Lru/ozon/uni/components/disclaimer/UniDisclaimerMainButtonTheme;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Primary extends UniDisclaimerMainButtonTheme {

        @NotNull
        public static final Primary INSTANCE = new Primary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Primary() {
            super(DeferredColor.m3262constructorimpl(r0.getColorTokens().getBgActionPrimary()), DeferredColor.m3262constructorimpl(r0.getColorTokens().getTextLightKey()), null);
            UniTheme uniTheme = UniTheme.INSTANCE;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Primary);
        }

        public int hashCode() {
            return -1839434823;
        }

        @NotNull
        public String toString() {
            return "Primary";
        }
    }

    public /* synthetic */ UniDisclaimerMainButtonTheme(Object obj, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2);
    }

    @NotNull
    /* renamed from: getBackgroundColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: getTextColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getTextColor() {
        return this.textColor;
    }

    private UniDisclaimerMainButtonTheme(Object backgroundColor, Object textColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.backgroundColor = backgroundColor;
        this.textColor = textColor;
    }
}
