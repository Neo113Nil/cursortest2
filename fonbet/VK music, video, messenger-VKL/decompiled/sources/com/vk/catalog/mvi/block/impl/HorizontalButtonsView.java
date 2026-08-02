package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.ahn;
import xsna.b2a;
import xsna.bhu0;
import xsna.e43;
import xsna.epx;
import xsna.f1u;
import xsna.g2a;
import xsna.gzs;
import xsna.ho8;
import xsna.izs;
import xsna.lg90;
import xsna.ne7;
import xsna.nr;
import xsna.pg90;
import xsna.q1a;
import xsna.q2a;
import xsna.q630;
import xsna.qiu0;
import xsna.r1a;
import xsna.r2a;
import xsna.s1a;
import xsna.s200;
import xsna.s3q0;
import xsna.t1a;
import xsna.u1a;
import xsna.wzs;
import xsna.zcl;

/* compiled from: HorizontalButtonsView.kt */
/* loaded from: classes.dex */
public final class HorizontalButtonsView {

    /* compiled from: HorizontalButtonsView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final ViewState d;
        public final CatalogButtonDo e;

        /* compiled from: HorizontalButtonsView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), ViewState.CREATOR.createFromParcel(parcel), (CatalogButtonDo) parcel.readParcelable(State.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, ViewState viewState, CatalogButtonDo catalogButtonDo, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = viewState;
            this.e = catalogButtonDo;
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final CatalogBlockVariant M7() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d) && epx.f(this.e, state.e);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31)) * 31;
            CatalogButtonDo catalogButtonDo = this.e;
            return hashCode + (catalogButtonDo == null ? 0 : catalogButtonDo.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", viewState=");
            sb.append(this.d);
            sb.append(", button=");
            sb.append(this.e);
            sb.append(')');
            return sb.toString();
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(BlockId.Simple.a(this.b), i);
            parcel.writeString(this.c.name());
            this.d.writeToParcel(parcel, i);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: HorizontalButtonsView.kt */
    public static final class ViewState implements r2a, Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final String b;
        public final String c;
        public final Style d;

        /* compiled from: HorizontalButtonsView.kt */
        /* loaded from: classes16.dex */
        public interface Style extends Parcelable {

            /* compiled from: HorizontalButtonsView.kt */
            public static final class Button implements Style {
                public static final Parcelable.Creator<Button> CREATOR = new a();
                public final Integer b;
                public final String c;

                /* compiled from: HorizontalButtonsView.kt */
                public static final class a implements Parcelable.Creator<Button> {
                    @Override // android.os.Parcelable.Creator
                    public final Button createFromParcel(Parcel parcel) {
                        return new Button(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Button[] newArray(int i) {
                        return new Button[i];
                    }
                }

                public Button(Integer num, String str) {
                    this.b = num;
                    this.c = str;
                }

                public final Integer d() {
                    return this.b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final String e() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return epx.f(this.b, button.b) && epx.f(this.c, button.c);
                }

                public final int hashCode() {
                    Integer num = this.b;
                    return this.c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(iconId=");
                    sb.append(this.b);
                    sb.append(", testTag=");
                    return ho8.a(sb, this.c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Integer num = this.b;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        nr.a(parcel, 1, num);
                    }
                    parcel.writeString(this.c);
                }
            }

            /* compiled from: HorizontalButtonsView.kt */
            public static final class CellButton implements Style {
                public static final Parcelable.Creator<CellButton> CREATOR = new a();
                public final Integer b;
                public final CellButton$IconBackgroundStyle c;
                public final String d;

                /* compiled from: HorizontalButtonsView.kt */
                public static final class a implements Parcelable.Creator<CellButton> {
                    @Override // android.os.Parcelable.Creator
                    public final CellButton createFromParcel(Parcel parcel) {
                        return new CellButton(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), CellButton$IconBackgroundStyle.valueOf(parcel.readString()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final CellButton[] newArray(int i) {
                        return new CellButton[i];
                    }
                }

                public CellButton(Integer num, CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, String str) {
                    this.b = num;
                    this.c = cellButton$IconBackgroundStyle;
                    this.d = str;
                }

                public final CellButton$IconBackgroundStyle d() {
                    return this.c;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final Integer e() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CellButton)) {
                        return false;
                    }
                    CellButton cellButton = (CellButton) obj;
                    return epx.f(this.b, cellButton.b) && this.c == cellButton.c && epx.f(this.d, cellButton.d);
                }

                public final String f() {
                    return this.d;
                }

                public final int hashCode() {
                    Integer num = this.b;
                    return this.d.hashCode() + ((this.c.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CellButton(iconId=");
                    sb.append(this.b);
                    sb.append(", iconBackgroundStyle=");
                    sb.append(this.c);
                    sb.append(", testTag=");
                    return ho8.a(sb, this.d, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Integer num = this.b;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        nr.a(parcel, 1, num);
                    }
                    parcel.writeString(this.c.name());
                    parcel.writeString(this.d);
                }
            }
        }

        /* compiled from: HorizontalButtonsView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState(((BlockId.Simple) parcel.readParcelable(ViewState.class.getClassLoader())).b, parcel.readString(), (Style) parcel.readParcelable(ViewState.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState(String str, String str2, Style style, zcl zclVar) {
            this.b = str;
            this.c = str2;
            this.d = style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(BlockId.Simple.a(this.b), i);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* compiled from: HorizontalButtonsView.kt */
    public static final class a extends q2a<ViewState, b> {
        @Override // xsna.q2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final ViewState viewState, final izs<? super b, s3q0> izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            ViewState.Style style = viewState.d;
            androidx.compose.runtime.a M = aVar.M(869020875);
            if ((i & 48) == 0) {
                i2 = (M.J(viewState) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(q630Var) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(869020875, i2, -1, "com.vk.catalog.mvi.block.impl.HorizontalButtonsView.BlockView.ContentImpl (HorizontalButtonsView.kt:120)");
                }
                boolean z = style instanceof ViewState.Style.CellButton;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                lg90 lg90Var = null;
                if (z) {
                    M.K(-1061690503);
                    ViewState.Style.CellButton cellButton = (ViewState.Style.CellButton) style;
                    q630 E = ahn.E(q630Var, cellButton.f());
                    String str = viewState.c;
                    if (str == null) {
                        str = "";
                    }
                    CellButton$Appearance cellButton$Appearance = CellButton$Appearance.Accent;
                    CellButton$IconBackgroundStyle d = cellButton.d();
                    Integer e = cellButton.e();
                    if (e == null) {
                        M.K(-1061342405);
                    } else {
                        M.K(-1061342404);
                        lg90Var = pg90.a(e.intValue(), 0, M);
                    }
                    M.j();
                    CellButton$IconSize cellButton$IconSize = CellButton$IconSize.Small;
                    boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new gzs() { // from class: com.vk.catalog.mvi.block.impl.i
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new HorizontalButtonsView.b(viewState.b));
                                return s3q0.a;
                            }
                        };
                        M.R(x);
                    }
                    qiu0.a(str, (gzs) x, E, lg90Var, null, null, 0, cellButton$Appearance, d, cellButton$IconSize, null, false, M, 817893376, 7280);
                    aVar2 = M;
                    aVar2.j();
                } else {
                    aVar2 = M;
                    if (style instanceof ViewState.Style.Button) {
                        aVar2.K(-1061066969);
                        float f = 8;
                        float f2 = 16;
                        ViewState.Style.Button button = (ViewState.Style.Button) style;
                        q630 E2 = ahn.E(s200.G(q630Var, f2, f, f2, f), button.e());
                        String str2 = viewState.c;
                        ButtonSize buttonSize = ButtonSize.Medium;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                        ButtonStyle buttonStyle = ButtonStyle.Secondary;
                        Integer d2 = button.d();
                        if (d2 == null) {
                            aVar2.K(-1060424805);
                        } else {
                            aVar2.K(-1060424804);
                            lg90Var = pg90.a(d2.intValue(), 0, aVar2);
                        }
                        aVar2.j();
                        boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                        Object x2 = aVar2.x();
                        if (z3 || x2 == c0012a) {
                            x2 = new gzs() { // from class: com.vk.catalog.mvi.block.impl.j
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs.this.invoke(new HorizontalButtonsView.b(viewState.b));
                                    return s3q0.a;
                                }
                            };
                            aVar2.R(x2);
                        }
                        bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E2, null, false, false, lg90Var, null, null, str2, null, null, null, null, false, null, null, null, aVar2, 1073745328, 0, 0, 4189664);
                        aVar2.j();
                    } else {
                        aVar2.K(1905460815);
                        aVar2.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.l(new wzs() { // from class: com.vk.catalog.mvi.block.impl.k
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        HorizontalButtonsView.a.this.c(a8aVar, viewState, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: HorizontalButtonsView.kt */
    /* loaded from: classes16.dex */
    public static final class b implements q1a {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: HorizontalButtonsView.kt */
    public static final class c extends u1a<State, b> {
        @Override // xsna.u1a
        public final void g(b bVar) {
            CatalogLinkButtonActionDo d;
            CatalogButtonDo catalogButtonDo = ((State) this.b.n()).e;
            if (catalogButtonDo == null || (d = catalogButtonDo.d()) == null) {
                return;
            }
            t(new r1a.a(d));
        }
    }

    /* compiled from: HorizontalButtonsView.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogLayoutDto.StyleDto.values().length];
            try {
                iArr[CatalogLayoutDto.StyleDto.BORDERLESS_WITH_ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogLayoutDto.StyleDto.ICON_TITLE_BUTTON_PRIMARY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class e<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ izs b;

        public e(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: HorizontalButtonsView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b2a, c> {
        public static final f b = new f(1, c.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final c invoke(b2a b2aVar) {
            return new c(b2aVar);
        }
    }

    public static Integer a(CatalogLayoutDto.StyleDto styleDto, CatalogLinkButtonActionDo catalogLinkButtonActionDo) {
        if (!(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.CreateAlbum)) {
            return null;
        }
        int i = d.$EnumSwitchMapping$0[styleDto.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.vk_icon_list_add_outline_24);
        }
        if (i != 2) {
            return null;
        }
        return Integer.valueOf(R.drawable.vk_icon_add_20);
    }

    public static void b(f1u f1uVar) {
        List l = e43.l(CatalogBlockVariant.HorizontalButtonsWithIconBorderless, CatalogBlockVariant.HorizontalButtonsWithIcon);
        g2a g2aVar = new g2a(new g());
        f fVar = f.b;
        h hVar = new h();
        a aVar = new a();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            f1uVar.a((CatalogBlockVariant) it.next(), g2aVar);
        }
        f1uVar.c(State.class, new e(fVar));
        f1uVar.h(State.class, hVar);
        f1uVar.g(ViewState.class, aVar);
    }
}
