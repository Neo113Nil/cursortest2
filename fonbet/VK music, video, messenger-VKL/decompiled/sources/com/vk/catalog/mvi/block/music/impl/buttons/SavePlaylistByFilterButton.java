package com.vk.catalog.mvi.block.music.impl.buttons;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.ahn;
import xsna.b2a;
import xsna.b6l;
import xsna.bdn;
import xsna.c1q;
import xsna.epx;
import xsna.f1u;
import xsna.fpf0;
import xsna.g2a;
import xsna.ge00;
import xsna.gzs;
import xsna.ho8;
import xsna.ie00;
import xsna.ikv0;
import xsna.izs;
import xsna.js8;
import xsna.ksr;
import xsna.lg90;
import xsna.m2a;
import xsna.msy;
import xsna.myc0;
import xsna.ne7;
import xsna.on50;
import xsna.pg90;
import xsna.q1a;
import xsna.q630;
import xsna.qiu0;
import xsna.r2a;
import xsna.s1a;
import xsna.s3q0;
import xsna.smk;
import xsna.spj;
import xsna.t1a;
import xsna.u1a;
import xsna.w1a;
import xsna.wzs;
import xsna.yc40;
import xsna.yvj;
import xsna.z0h0;
import xsna.zcl;

/* compiled from: SavePlaylistByFilterButton.kt */
/* loaded from: classes.dex */
public final class SavePlaylistByFilterButton {

    /* compiled from: SavePlaylistByFilterButton.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final ViewState d;
        public final String e;

        /* compiled from: SavePlaylistByFilterButton.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), ViewState.CREATOR.createFromParcel(parcel), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, ViewState viewState, String str2, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = viewState;
            this.e = str2;
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
            String str = this.e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", viewState=");
            sb.append(this.d);
            sb.append(", searchType=");
            return ho8.a(sb, this.e, ')');
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
            parcel.writeString(this.e);
        }
    }

    /* compiled from: SavePlaylistByFilterButton.kt */
    public static final class ViewState implements r2a, Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: SavePlaylistByFilterButton.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState(((BlockId.Simple) parcel.readParcelable(ViewState.class.getClassLoader())).b, parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState(String str, String str2, zcl zclVar) {
            this.b = str;
            this.c = str2;
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
        }
    }

    /* compiled from: SavePlaylistByFilterButton.kt */
    public static final class a extends m2a<ViewState, b, c> {

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: SavePlaylistByFilterButton.kt */
        @b6l(c = "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$BlockView$HandleButtonsEvents$1$1", f = "SavePlaylistByFilterButton.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invokeSuspend")
        /* renamed from: com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$a$a, reason: collision with other inner class name */
        /* loaded from: classes16.dex */
        public static final class C0453a<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
            final /* synthetic */ Context $context;
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* compiled from: SavePlaylistByFilterButton.kt */
            @b6l(c = "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$BlockView$HandleButtonsEvents$1$1$1", f = "SavePlaylistByFilterButton.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton$a$a$a, reason: collision with other inner class name */
            public static final class C0454a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ Context $context;
                final /* synthetic */ String $title;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0454a(Context context, String str, spj<? super C0454a> spjVar) {
                    super(2, spjVar);
                    this.$context = context;
                    this.$title = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C0454a(this.$context, this.$title, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C0454a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    ikv0.a aVar = new ikv0.a(this.$context);
                    aVar.u = new ikv0.d(new ikv0.d.c(this.$title), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                    aVar.n();
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0453a(Context context, spj<? super C0453a> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C0453a c0453a = new C0453a(this.$context, spjVar);
                c0453a.L$0 = obj;
                return c0453a;
            }

            @Override // xsna.wzs
            public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
                return ((C0453a) create((c) obj, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String string;
                String str;
                c cVar = (c) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if (!(cVar instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.a aVar = (c.a) cVar;
                    if (aVar.b || (str = aVar.c) == null || str.length() == 0) {
                        string = this.$context.getString(aVar.b ? R.string.catalog_my_music_playlist_added : R.string.catalog_my_music_playlist_duplicate_adding);
                    } else {
                        string = aVar.c;
                    }
                    bdn bdnVar = bdn.a;
                    ge00 ge00Var = ie00.a;
                    C0454a c0454a = new C0454a(this.$context, string, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (myc0.k(ge00Var, c0454a, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        public a() {
            super(fpf0.a(c.class));
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(final a8a a8aVar, final ViewState viewState, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-1749036702);
            if ((i & 48) == 0) {
                i2 = (M.J(viewState) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(ksrVar) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= M.J(q630Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= M.J(this) ? 131072 : 65536;
            }
            if (M.t(i2 & 1, (74897 & i2) != 74896)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1749036702, i2, -1, "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton.BlockView.ContentImpl (SavePlaylistByFilterButton.kt:185)");
                }
                d(ksrVar, M, ((i2 >> 9) & 14) | ((i2 >> 12) & 112));
                q630 E = ahn.E(q630Var, "mvi_catalog_save_music_playlist_btn_test_tag");
                String str = viewState.c;
                if (str == null) {
                    str = "";
                }
                CellButton$Appearance cellButton$Appearance = CellButton$Appearance.Accent;
                CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle = CellButton$IconBackgroundStyle.None;
                lg90 a = pg90.a(R.drawable.vk_icon_list_add_outline_24, 0, M);
                CellButton$IconSize cellButton$IconSize = CellButton$IconSize.Small;
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new gzs() { // from class: com.vk.catalog.mvi.block.music.impl.buttons.d
                        @Override // xsna.gzs
                        public final Object invoke() {
                            izs.this.invoke(new SavePlaylistByFilterButton.b(viewState.b));
                            return s3q0.a;
                        }
                    };
                    M.R(x);
                }
                aVar2 = M;
                qiu0.a(str, (gzs) x, E, a, null, null, 0, cellButton$Appearance, cellButton$IconBackgroundStyle, cellButton$IconSize, null, false, aVar2, 918556672, 7280);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.l(new wzs() { // from class: com.vk.catalog.mvi.block.music.impl.buttons.e
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        SavePlaylistByFilterButton.a.this.b(a8aVar, viewState, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }

        public final <T extends c> void d(ksr<? extends T> ksrVar, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(2146229445);
            if ((i & 6) == 0) {
                i2 = (M.J(ksrVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2146229445, i2, -1, "com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton.BlockView.HandleButtonsEvents (SavePlaylistByFilterButton.kt:201)");
                }
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
                boolean y = M.y(context);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new C0453a(context, null);
                    M.R(x);
                }
                c1q.a(ksrVar, (wzs) x, M, i2 & 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new js8(this, ksrVar, i, 2));
            }
        }
    }

    /* compiled from: SavePlaylistByFilterButton.kt */
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

    /* compiled from: SavePlaylistByFilterButton.kt */
    public interface c extends smk {

        /* compiled from: SavePlaylistByFilterButton.kt */
        /* loaded from: classes16.dex */
        public static final class a implements c {
            public final BlockId.Simple a;
            public final boolean b;
            public final String c;

            public a(BlockId.Simple simple, boolean z, String str) {
                this.a = simple;
                this.b = z;
                this.c = str;
            }

            @Override // xsna.smk
            public final BlockId w() {
                return this.a;
            }
        }
    }

    /* compiled from: SavePlaylistByFilterButton.kt */
    public static final class d extends u1a<State, b> {
        public final Object c;

        public d(b2a b2aVar) {
            super(b2aVar);
            this.c = msy.a(LazyThreadSafetyMode.NONE, new z0h0(0));
        }

        @Override // xsna.u1a
        public final void g(b bVar) {
            State state = (State) this.b.n();
            v(new yc40.d(state.b));
            String str = state.e;
            if (str == null) {
                return;
            }
            w1a.b(this, on50.a.a(str), new com.vk.catalog.mvi.block.music.impl.buttons.f(this, state, null), 2);
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

    /* compiled from: SavePlaylistByFilterButton.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b2a, d> {
        public static final f b = new f(1, d.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final d invoke(b2a b2aVar) {
            return new d(b2aVar);
        }
    }

    public static void a(f1u f1uVar) {
        List singletonList = Collections.singletonList(CatalogBlockVariant.MusicSavePlaylistByFilterButton);
        g2a g2aVar = new g2a(new com.vk.catalog.mvi.block.music.impl.buttons.a());
        f fVar = f.b;
        com.vk.catalog.mvi.block.music.impl.buttons.b bVar = new com.vk.catalog.mvi.block.music.impl.buttons.b();
        a aVar = new a();
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            f1uVar.a((CatalogBlockVariant) it.next(), g2aVar);
        }
        f1uVar.c(State.class, new e(fVar));
        f1uVar.h(State.class, bVar);
        f1uVar.g(ViewState.class, aVar);
    }
}
