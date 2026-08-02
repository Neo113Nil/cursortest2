package ru.ozon.app.android.pdp.widgets.aspectsV4.presentation;

import Ak.C2436a;
import Ak.b;
import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0015R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "", "selectedColor", "scrollPosition", "", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "variants", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "widgetTokenizedEvent", "<init>", "(JLjava/lang/Integer;Ljava/lang/String;ILjava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getSelectedColor", "I", "getScrollPosition", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "LWZ/t;", "getWidgetTokenizedEvent", "()LWZ/t;", "Variant", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AspectsV4ImageVO implements c {
    private final long id;
    private final int scrollPosition;
    private final Integer scrollWidgetKey;

    @NotNull
    private final String selectedColor;

    @NotNull
    private final List<Variant> variants;
    private final t widgetTokenizedEvent;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b\r\u00100R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b\u000e\u00100R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b\u000f\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u0010\u001aR\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/AspectsV4ImageVO$Variant;", "", "", "id", "", "rootScrollWidgetKey", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "", "isSelected", "isOutOfStock", "isWave", "", "refreshDeeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLjava/lang/Integer;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZZLjava/lang/String;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getRootScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "Ljava/lang/String;", "getRefreshDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Variant {
        private final AtomAction action;
        private final BadgeDTO badge;
        private final long id;

        @NotNull
        private final ImageDTO image;
        private final boolean isOutOfStock;
        private final boolean isSelected;
        private final boolean isWave;
        private final TextDTO label;

        @NotNull
        private final String refreshDeeplink;
        private final Integer rootScrollWidgetKey;
        private final t tokenizedEvent;

        public Variant(long j11, Integer num, @NotNull ImageDTO image, BadgeDTO badgeDTO, TextDTO textDTO, boolean z11, boolean z12, boolean z13, @NotNull String refreshDeeplink, t tVar, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
            this.id = j11;
            this.rootScrollWidgetKey = num;
            this.image = image;
            this.badge = badgeDTO;
            this.label = textDTO;
            this.isSelected = z11;
            this.isOutOfStock = z12;
            this.isWave = z13;
            this.refreshDeeplink = refreshDeeplink;
            this.tokenizedEvent = tVar;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Variant)) {
                return false;
            }
            Variant variant = (Variant) other;
            return this.id == variant.id && Intrinsics.d(this.rootScrollWidgetKey, variant.rootScrollWidgetKey) && Intrinsics.d(this.image, variant.image) && Intrinsics.d(this.badge, variant.badge) && Intrinsics.d(this.label, variant.label) && this.isSelected == variant.isSelected && this.isOutOfStock == variant.isOutOfStock && this.isWave == variant.isWave && Intrinsics.d(this.refreshDeeplink, variant.refreshDeeplink) && Intrinsics.d(this.tokenizedEvent, variant.tokenizedEvent) && Intrinsics.d(this.action, variant.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final String getRefreshDeeplink() {
            return this.refreshDeeplink;
        }

        public final Integer getRootScrollWidgetKey() {
            return this.rootScrollWidgetKey;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            Integer num = this.rootScrollWidgetKey;
            int b11 = a.b(this.image, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            int hashCode2 = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            TextDTO textDTO = this.label;
            int a11 = g.a(C3532b.a(C3532b.a(C3532b.a((hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.isSelected), 31, this.isOutOfStock), 31, this.isWave), 31, this.refreshDeeplink);
            t tVar = this.tokenizedEvent;
            int hashCode3 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        /* renamed from: isOutOfStock, reason: from getter */
        public final boolean getIsOutOfStock() {
            return this.isOutOfStock;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: isWave, reason: from getter */
        public final boolean getIsWave() {
            return this.isWave;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            Integer num = this.rootScrollWidgetKey;
            ImageDTO imageDTO = this.image;
            BadgeDTO badgeDTO = this.badge;
            TextDTO textDTO = this.label;
            boolean z11 = this.isSelected;
            boolean z12 = this.isOutOfStock;
            boolean z13 = this.isWave;
            String str = this.refreshDeeplink;
            t tVar = this.tokenizedEvent;
            AtomAction atomAction = this.action;
            StringBuilder c11 = Lh.a.c("Variant(id=", j11, ", rootScrollWidgetKey=", num);
            c11.append(", image=");
            c11.append(imageDTO);
            c11.append(", badge=");
            c11.append(badgeDTO);
            c11.append(", label=");
            c11.append(textDTO);
            c11.append(", isSelected=");
            c11.append(z11);
            C2436a.e(", isOutOfStock=", ", isWave=", c11, z12, z13);
            Bi.a.f(c11, ", refreshDeeplink=", str, ", tokenizedEvent=", tVar);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(")");
            return c11.toString();
        }
    }

    public AspectsV4ImageVO(long j11, Integer num, @NotNull String selectedColor, int i11, @NotNull List<Variant> variants, t tVar) {
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.selectedColor = selectedColor;
        this.scrollPosition = i11;
        this.variants = variants;
        this.widgetTokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AspectsV4ImageVO)) {
            return false;
        }
        AspectsV4ImageVO aspectsV4ImageVO = (AspectsV4ImageVO) other;
        return this.id == aspectsV4ImageVO.id && Intrinsics.d(this.scrollWidgetKey, aspectsV4ImageVO.scrollWidgetKey) && Intrinsics.d(this.selectedColor, aspectsV4ImageVO.selectedColor) && this.scrollPosition == aspectsV4ImageVO.scrollPosition && Intrinsics.d(this.variants, aspectsV4ImageVO.variants) && Intrinsics.d(this.widgetTokenizedEvent, aspectsV4ImageVO.widgetTokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getScrollPosition() {
        return this.scrollPosition;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    @NotNull
    public final String getSelectedColor() {
        return this.selectedColor;
    }

    @NotNull
    public final List<Variant> getVariants() {
        return this.variants;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getWidgetTokenizedEvent() {
        return this.widgetTokenizedEvent;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int b11 = g.b(C2454a.a(this.scrollPosition, g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.selectedColor), 31), 31, this.variants);
        t tVar = this.widgetTokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        String str = this.selectedColor;
        int i11 = this.scrollPosition;
        List<Variant> list = this.variants;
        t tVar = this.widgetTokenizedEvent;
        StringBuilder c11 = Lh.a.c("AspectsV4ImageVO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", selectedColor=");
        c11.append(str);
        c11.append(", scrollPosition=");
        c11.append(i11);
        b.h(c11, ", variants=", list, ", widgetTokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
