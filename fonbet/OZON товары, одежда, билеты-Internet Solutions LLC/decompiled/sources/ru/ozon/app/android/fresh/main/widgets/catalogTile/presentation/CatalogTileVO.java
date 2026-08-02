package ru.ozon.app.android.fresh.main.widgets.catalogTile.presentation;

import Am.C2438a;
import B0.C2454a;
import De.C2859b;
import Ek.a;
import G.g;
import Ns.b;
import WZ.t;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.CatalogTileDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.data.TilePreset;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003-./BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "preset", "", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "tiles", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "spacers", "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "getPreset", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "Ljava/util/List;", "getTiles", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "getSpacers", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "TileVO", "FavoriteBadge", "PaddingsVO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogTileVO implements c {
    private final String backgroundColor;
    private final long id;

    @NotNull
    private final TilePreset preset;

    @NotNull
    private final PaddingsVO spacers;

    @NotNull
    private final List<TileVO> tiles;
    private final t tokenizedEvent;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "gradient", "", "borderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "component1", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component2", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component3", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "component4", "()Ljava/lang/String;", "component5", "()Lru/ozon/uni/atoms/af/AtomAction;", "component6", "()LWZ/t;", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "getGradient", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "LWZ/t;", "getTokenizedEvent", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteBadge {
        private final AtomAction action;
        private final String borderColor;

        @NotNull
        private final CatalogTileDTO.Gradient gradient;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;
        private final t tokenizedEvent;

        public FavoriteBadge(@NotNull IconDTO icon, @NotNull TextDTO text, @NotNull CatalogTileDTO.Gradient gradient, String str, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(gradient, "gradient");
            this.icon = icon;
            this.text = text;
            this.gradient = gradient;
            this.borderColor = str;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public static /* synthetic */ FavoriteBadge copy$default(FavoriteBadge favoriteBadge, IconDTO iconDTO, TextDTO textDTO, CatalogTileDTO.Gradient gradient, String str, AtomAction atomAction, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = favoriteBadge.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = favoriteBadge.text;
            }
            if ((i11 & 4) != 0) {
                gradient = favoriteBadge.gradient;
            }
            if ((i11 & 8) != 0) {
                str = favoriteBadge.borderColor;
            }
            if ((i11 & 16) != 0) {
                atomAction = favoriteBadge.action;
            }
            if ((i11 & 32) != 0) {
                tVar = favoriteBadge.tokenizedEvent;
            }
            AtomAction atomAction2 = atomAction;
            t tVar2 = tVar;
            return favoriteBadge.copy(iconDTO, textDTO, gradient, str, atomAction2, tVar2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CatalogTileDTO.Gradient getGradient() {
            return this.gradient;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomAction getAction() {
            return this.action;
        }

        /* renamed from: component6, reason: from getter */
        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @NotNull
        public final FavoriteBadge copy(@NotNull IconDTO icon, @NotNull TextDTO text, @NotNull CatalogTileDTO.Gradient gradient, String borderColor, AtomAction action, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(gradient, "gradient");
            return new FavoriteBadge(icon, text, gradient, borderColor, action, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FavoriteBadge)) {
                return false;
            }
            FavoriteBadge favoriteBadge = (FavoriteBadge) other;
            return Intrinsics.d(this.icon, favoriteBadge.icon) && Intrinsics.d(this.text, favoriteBadge.text) && Intrinsics.d(this.gradient, favoriteBadge.gradient) && Intrinsics.d(this.borderColor, favoriteBadge.borderColor) && Intrinsics.d(this.action, favoriteBadge.action) && Intrinsics.d(this.tokenizedEvent, favoriteBadge.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final CatalogTileDTO.Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = (this.gradient.hashCode() + b.a(this.text, this.icon.hashCode() * 31, 31)) * 31;
            String str = this.borderColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.text;
            CatalogTileDTO.Gradient gradient = this.gradient;
            String str = this.borderColor;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder i11 = Bi.b.i("FavoriteBadge(icon=", ", text=", ", gradient=", iconDTO, textDTO);
            i11.append(gradient);
            i11.append(", borderColor=");
            i11.append(str);
            i11.append(", action=");
            return C2859b.e(tVar, ", tokenizedEvent=", ")", i11, atomAction);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$PaddingsVO;", "", "", "left", "top", "right", "bottom", "between", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "getBetween", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsVO {
        private final int between;
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13, int i14, int i15) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
            this.between = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.left == paddingsVO.left && this.top == paddingsVO.top && this.right == paddingsVO.right && this.bottom == paddingsVO.bottom && this.between == paddingsVO.between;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.between) + C2454a.a(this.bottom, C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.left;
            int i12 = this.top;
            int i13 = this.right;
            int i14 = this.bottom;
            int i15 = this.between;
            StringBuilder a11 = C2438a.a("PaddingsVO(left=", i11, ", top=", ", right=", i12);
            a.f(i13, i14, ", bottom=", ", between=", a11);
            return K00.b.e(i15, ")", a11);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "badge", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;Ljava/lang/String;LWZ/t;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component3", "()Lru/ozon/uni/atoms/af/AtomAction;", "component4", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "component5", "component6", "()LWZ/t;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;Ljava/lang/String;LWZ/t;)Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$TileVO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/presentation/CatalogTileVO$FavoriteBadge;", "getBadge", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileVO {
        private final AtomAction action;
        private final String backgroundColor;
        private final FavoriteBadge badge;

        @NotNull
        private final String image;
        private final TextDTO title;
        private final t tokenizedEvent;

        public TileVO(@NotNull String image, TextDTO textDTO, AtomAction atomAction, FavoriteBadge favoriteBadge, String str, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.title = textDTO;
            this.action = atomAction;
            this.badge = favoriteBadge;
            this.backgroundColor = str;
            this.tokenizedEvent = tVar;
        }

        public static /* synthetic */ TileVO copy$default(TileVO tileVO, String str, TextDTO textDTO, AtomAction atomAction, FavoriteBadge favoriteBadge, String str2, t tVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tileVO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = tileVO.title;
            }
            if ((i11 & 4) != 0) {
                atomAction = tileVO.action;
            }
            if ((i11 & 8) != 0) {
                favoriteBadge = tileVO.badge;
            }
            if ((i11 & 16) != 0) {
                str2 = tileVO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                tVar = tileVO.tokenizedEvent;
            }
            String str3 = str2;
            t tVar2 = tVar;
            return tileVO.copy(str, textDTO, atomAction, favoriteBadge, str3, tVar2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomAction getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final FavoriteBadge getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @NotNull
        public final TileVO copy(@NotNull String image, TextDTO title, AtomAction action, FavoriteBadge badge, String backgroundColor, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new TileVO(image, title, action, badge, backgroundColor, tokenizedEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileVO)) {
                return false;
            }
            TileVO tileVO = (TileVO) other;
            return Intrinsics.d(this.image, tileVO.image) && Intrinsics.d(this.title, tileVO.title) && Intrinsics.d(this.action, tileVO.action) && Intrinsics.d(this.badge, tileVO.badge) && Intrinsics.d(this.backgroundColor, tileVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, tileVO.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final FavoriteBadge getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            FavoriteBadge favoriteBadge = this.badge;
            int hashCode4 = (hashCode3 + (favoriteBadge == null ? 0 : favoriteBadge.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            TextDTO textDTO = this.title;
            AtomAction atomAction = this.action;
            FavoriteBadge favoriteBadge = this.badge;
            String str2 = this.backgroundColor;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = Co.a.b("TileVO(image=", textDTO, str, ", title=", ", action=");
            b11.append(atomAction);
            b11.append(", badge=");
            b11.append(favoriteBadge);
            b11.append(", backgroundColor=");
            b11.append(str2);
            b11.append(", tokenizedEvent=");
            b11.append(tVar);
            b11.append(")");
            return b11.toString();
        }
    }

    public CatalogTileVO(long j11, @NotNull TilePreset preset, @NotNull List<TileVO> tiles, @NotNull PaddingsVO spacers, String str, t tVar) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.preset = preset;
        this.tiles = tiles;
        this.spacers = spacers;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogTileVO)) {
            return false;
        }
        CatalogTileVO catalogTileVO = (CatalogTileVO) other;
        return this.id == catalogTileVO.id && this.preset == catalogTileVO.preset && Intrinsics.d(this.tiles, catalogTileVO.tiles) && Intrinsics.d(this.spacers, catalogTileVO.spacers) && Intrinsics.d(this.backgroundColor, catalogTileVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, catalogTileVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TilePreset getPreset() {
        return this.preset;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final PaddingsVO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final List<TileVO> getTiles() {
        return this.tiles;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.spacers.hashCode() + g.b((this.preset.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.tiles)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TilePreset tilePreset = this.preset;
        List<TileVO> list = this.tiles;
        PaddingsVO paddingsVO = this.spacers;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CatalogTileVO(id=");
        sb2.append(j11);
        sb2.append(", preset=");
        sb2.append(tilePreset);
        sb2.append(", tiles=");
        sb2.append(list);
        sb2.append(", spacers=");
        sb2.append(paddingsVO);
        Bi.a.f(sb2, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
