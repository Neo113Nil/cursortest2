package ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation;

import Ak.C2436a;
import An.C2439a;
import D3.g;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.data.InstallmentPurchaseV4DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001:\u0002?@Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "gradientBadge", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;", "image", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "getGradientBadge", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;", "getImage", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO$Image;", "GradientBadge", "Gradient", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstallmentPurchaseV4VI implements c {
    private final AtomAction action;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final GradientBadge gradientBadge;
    private final IconDTO icon;
    private final long id;
    private final InstallmentPurchaseV4DTO.Image image;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO text;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$Gradient;", "", "", "Ll1/Z;", "lightValues", "darkValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLightValues", "()Ljava/util/List;", "getDarkValues", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient {

        @NotNull
        private final List<C7807Z> darkValues;

        @NotNull
        private final List<C7807Z> lightValues;

        public Gradient(@NotNull List<C7807Z> lightValues, @NotNull List<C7807Z> darkValues) {
            Intrinsics.checkNotNullParameter(lightValues, "lightValues");
            Intrinsics.checkNotNullParameter(darkValues, "darkValues");
            this.lightValues = lightValues;
            this.darkValues = darkValues;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.lightValues, gradient.lightValues) && Intrinsics.d(this.darkValues, gradient.darkValues);
        }

        @NotNull
        public final List<C7807Z> getDarkValues() {
            return this.darkValues;
        }

        @NotNull
        public final List<C7807Z> getLightValues() {
            return this.lightValues;
        }

        public int hashCode() {
            return this.darkValues.hashCode() + (this.lightValues.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2436a.b("Gradient(lightValues=", this.lightValues, ", darkValues=", ")", this.darkValues);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$GradientBadge;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "backgroundColor", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$Gradient;", "gradient", "", "animationTimer", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$Gradient;Ljava/lang/Integer;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$Gradient;", "getGradient", "()Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI$Gradient;", "Ljava/lang/Integer;", "getAnimationTimer", "()Ljava/lang/Integer;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GradientBadge {
        private final Integer animationTimer;
        private final String backgroundColor;
        private final Gradient gradient;

        @NotNull
        private final TextDTO text;
        private final t tokenizedEvent;

        public GradientBadge(@NotNull TextDTO text, String str, Gradient gradient, Integer num, t tVar) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.backgroundColor = str;
            this.gradient = gradient;
            this.animationTimer = num;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GradientBadge)) {
                return false;
            }
            GradientBadge gradientBadge = (GradientBadge) other;
            return Intrinsics.d(this.text, gradientBadge.text) && Intrinsics.d(this.backgroundColor, gradientBadge.backgroundColor) && Intrinsics.d(this.gradient, gradientBadge.gradient) && Intrinsics.d(this.animationTimer, gradientBadge.animationTimer) && Intrinsics.d(this.tokenizedEvent, gradientBadge.tokenizedEvent);
        }

        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Gradient gradient = this.gradient;
            int hashCode3 = (hashCode2 + (gradient == null ? 0 : gradient.hashCode())) * 31;
            Integer num = this.animationTimer;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.backgroundColor;
            Gradient gradient = this.gradient;
            Integer num = this.animationTimer;
            t tVar = this.tokenizedEvent;
            StringBuilder f7 = g.f("GradientBadge(text=", textDTO, ", backgroundColor=", str, ", gradient=");
            f7.append(gradient);
            f7.append(", animationTimer=");
            f7.append(num);
            f7.append(", tokenizedEvent=");
            return b.d(f7, tVar, ")");
        }
    }

    public InstallmentPurchaseV4VI(long j11, BadgeDTO badgeDTO, @NotNull TextDTO text, IconDTO iconDTO, String str, AtomAction atomAction, t tVar, TestInfo testInfo, GradientBadge gradientBadge, InstallmentPurchaseV4DTO.Image image) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = j11;
        this.badge = badgeDTO;
        this.text = text;
        this.icon = iconDTO;
        this.backgroundColor = str;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
        this.gradientBadge = gradientBadge;
        this.image = image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPurchaseV4VI)) {
            return false;
        }
        InstallmentPurchaseV4VI installmentPurchaseV4VI = (InstallmentPurchaseV4VI) other;
        return this.id == installmentPurchaseV4VI.id && Intrinsics.d(this.badge, installmentPurchaseV4VI.badge) && Intrinsics.d(this.text, installmentPurchaseV4VI.text) && Intrinsics.d(this.icon, installmentPurchaseV4VI.icon) && Intrinsics.d(this.backgroundColor, installmentPurchaseV4VI.backgroundColor) && Intrinsics.d(this.action, installmentPurchaseV4VI.action) && Intrinsics.d(this.tokenizedEvent, installmentPurchaseV4VI.tokenizedEvent) && Intrinsics.d(this.testInfo, installmentPurchaseV4VI.testInfo) && Intrinsics.d(this.gradientBadge, installmentPurchaseV4VI.gradientBadge) && Intrinsics.d(this.image, installmentPurchaseV4VI.image);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final GradientBadge getGradientBadge() {
        return this.gradientBadge;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final InstallmentPurchaseV4DTO.Image getImage() {
        return this.image;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.badge;
        int a11 = Ns.b.a(this.text, (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31);
        IconDTO iconDTO = this.icon;
        int hashCode2 = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode4 = (hashCode3 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        GradientBadge gradientBadge = this.gradientBadge;
        int hashCode7 = (hashCode6 + (gradientBadge == null ? 0 : gradientBadge.hashCode())) * 31;
        InstallmentPurchaseV4DTO.Image image = this.image;
        return hashCode7 + (image != null ? image.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        BadgeDTO badgeDTO = this.badge;
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        String str = this.backgroundColor;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        GradientBadge gradientBadge = this.gradientBadge;
        InstallmentPurchaseV4DTO.Image image = this.image;
        StringBuilder sb2 = new StringBuilder("InstallmentPurchaseV4VI(id=");
        sb2.append(j11);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", text=");
        sb2.append(textDTO);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        C2439a.c(", backgroundColor=", str, ", action=", sb2, atomAction);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", gradientBadge=");
        sb2.append(gradientBadge);
        sb2.append(", image=");
        sb2.append(image);
        sb2.append(")");
        return sb2.toString();
    }
}
