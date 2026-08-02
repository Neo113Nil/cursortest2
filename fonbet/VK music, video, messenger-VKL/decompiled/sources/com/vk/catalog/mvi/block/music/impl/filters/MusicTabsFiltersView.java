package com.vk.catalog.mvi.block.music.impl.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a8a;
import xsna.ao;
import xsna.b2a;
import xsna.b6l;
import xsna.bek0;
import xsna.bo;
import xsna.epx;
import xsna.eqy;
import xsna.f1u;
import xsna.fpf0;
import xsna.fw3;
import xsna.g2a;
import xsna.izs;
import xsna.j5g;
import xsna.ksr;
import xsna.l2a;
import xsna.lsr;
import xsna.m2a;
import xsna.m7a;
import xsna.p1p0;
import xsna.p4a;
import xsna.q1a;
import xsna.q630;
import xsna.qha;
import xsna.r2a;
import xsna.s1a;
import xsna.s3q0;
import xsna.smk;
import xsna.spj;
import xsna.t1a;
import xsna.u1a;
import xsna.u580;
import xsna.w1a;
import xsna.wzs;
import xsna.xa40;
import xsna.y4a;
import xsna.yc40;
import xsna.yvj;
import xsna.yzs;
import xsna.zcl;

/* compiled from: MusicTabsFiltersView.kt */
/* loaded from: classes.dex */
public final class MusicTabsFiltersView {

    /* compiled from: MusicTabsFiltersView.kt */
    public static final class TabsState implements CatalogBlockState {
        public static final Parcelable.Creator<TabsState> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final List<CatalogFilterOptionDo> d;
        public final EditModeState e;

        /* compiled from: MusicTabsFiltersView.kt */
        public static final class EditModeState implements Parcelable {
            public static final Parcelable.Creator<EditModeState> CREATOR = new a();
            public boolean b;

            /* compiled from: MusicTabsFiltersView.kt */
            public static final class a implements Parcelable.Creator<EditModeState> {
                @Override // android.os.Parcelable.Creator
                public final EditModeState createFromParcel(Parcel parcel) {
                    return new EditModeState(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final EditModeState[] newArray(int i) {
                    return new EditModeState[i];
                }
            }

            public EditModeState() {
                this(false, 1, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EditModeState) && this.b == ((EditModeState) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("EditModeState(isEditModeEnabled="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
            }

            public EditModeState(boolean z) {
                this.b = z;
            }

            public /* synthetic */ EditModeState(boolean z, int i, zcl zclVar) {
                this((i & 1) != 0 ? false : z);
            }
        }

        /* compiled from: MusicTabsFiltersView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<TabsState> {
            @Override // android.os.Parcelable.Creator
            public final TabsState createFromParcel(Parcel parcel) {
                String str = ((BlockId.Simple) parcel.readParcelable(TabsState.class.getClassLoader())).b;
                CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(TabsState.class, parcel, arrayList, i, 1);
                }
                return new TabsState(str, valueOf, arrayList, EditModeState.CREATOR.createFromParcel(parcel), null);
            }

            @Override // android.os.Parcelable.Creator
            public final TabsState[] newArray(int i) {
                return new TabsState[i];
            }
        }

        public TabsState() {
            throw null;
        }

        public TabsState(String str, CatalogBlockVariant catalogBlockVariant, List list, EditModeState editModeState, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = list;
            this.e = editModeState;
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
            if (!(obj instanceof TabsState)) {
                return false;
            }
            TabsState tabsState = (TabsState) obj;
            return BlockId.Simple.b(this.b, tabsState.b) && this.c == tabsState.c && epx.f(this.d, tabsState.d) && epx.f(this.e, tabsState.e);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e.b) + fw3.a(io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabsState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", tabs=");
            sb.append(this.d);
            sb.append(", editModeState=");
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
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            this.e.writeToParcel(parcel, i);
        }
    }

    /* compiled from: MusicTabsFiltersView.kt */
    public static final class a extends m2a<f, b, c> {
        public a() {
            super(fpf0.a(c.class));
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(final a8a a8aVar, final f fVar, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(856618348);
            if ((i & 48) == 0) {
                i2 = (M.J(fVar) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 24576) == 0) {
                i2 |= M.J(q630Var) ? 16384 : 8192;
            }
            if (M.t(i2 & 1, (i2 & 8337) != 8336)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(856618348, i2, -1, "com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView.BlockView.ContentImpl (MusicTabsFiltersView.kt:209)");
                }
                if (fVar.c.isEmpty()) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.f s = M.s();
                    if (s != null) {
                        s.l(new wzs() { // from class: xsna.t950
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                MusicTabsFiltersView.a.this.b(a8aVar, fVar, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                                return s3q0.a;
                            }
                        });
                        return;
                    }
                    return;
                }
                qha.a(fVar, izsVar, q630Var, M, ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 6) & 896));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s2 = M.s();
            if (s2 != null) {
                s2.l(new l2a(this, a8aVar, fVar, izsVar, ksrVar, q630Var, i, 1));
            }
        }
    }

    /* compiled from: MusicTabsFiltersView.kt */
    /* loaded from: classes16.dex */
    public interface b extends q1a {

        /* compiled from: MusicTabsFiltersView.kt */
        public static final class a implements b {
            public final String b;
            public final String c;

            public a(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: MusicTabsFiltersView.kt */
    public interface c extends smk {
    }

    /* compiled from: MusicTabsFiltersView.kt */
    /* loaded from: classes16.dex */
    public static final class d extends u1a<TabsState, b> {
        public final m7a c;

        /* compiled from: MusicTabsFiltersView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView$InlineActor$1", f = "MusicTabsFiltersView.kt", l = {168}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;

            /* compiled from: MusicTabsFiltersView.kt */
            /* renamed from: com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView$d$a$a, reason: collision with other inner class name */
            public static final class C0455a<T> implements lsr {
                public final /* synthetic */ d b;

                public C0455a(d dVar) {
                    this.b = dVar;
                }

                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    final y4a y4aVar = (y4a) obj;
                    if (y4aVar instanceof u580) {
                        this.b.m(new izs() { // from class: com.vk.catalog.mvi.block.music.impl.filters.d
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                MusicTabsFiltersView.TabsState tabsState = (MusicTabsFiltersView.TabsState) obj2;
                                MusicTabsFiltersView.TabsState.EditModeState editModeState = tabsState.e;
                                editModeState.b = ((u580) y4a.this).b;
                                s3q0 s3q0Var = s3q0.a;
                                return new MusicTabsFiltersView.TabsState(tabsState.b, tabsState.c, tabsState.d, editModeState, null);
                            }
                        });
                    }
                    return s3q0.a;
                }
            }

            public a(spj<? super a> spjVar) {
                super(2, spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return d.this.new a(spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    ksr<y4a> b = d.this.c.b();
                    C0455a c0455a = new C0455a(d.this);
                    this.label = 1;
                    if (b.collect(c0455a, this) == coroutineSingletons) {
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

        public d(b2a b2aVar, m7a m7aVar) {
            super(b2aVar);
            this.c = m7aVar;
            w1a.b(this, null, new a(null), 3);
        }

        @Override // xsna.u1a
        public final void g(b bVar) {
            b bVar2 = bVar;
            if (!(bVar2 instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((b.a) bVar2).c;
            v(new yc40.e(str));
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            b.d i = com.vk.toggle.b.A.i(MusicFeatures.AUDIO_TRACKS_FILTERS);
            if (p1p0.a(i)) {
                if (epx.f(i != null ? i.c.toString() : null, "reset-sort")) {
                    r();
                }
            }
            s(Collections.singletonList(str));
        }
    }

    /* compiled from: MusicTabsFiltersView.kt */
    /* loaded from: classes16.dex */
    public static final class e {
        public final String a;
        public final String b;
        public final boolean c;

        public e(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }
    }

    /* compiled from: MusicTabsFiltersView.kt */
    public static final class f implements r2a {
        public final String b;
        public final ArrayList c;
        public final boolean d;

        public f() {
            throw null;
        }

        public f(String str, ArrayList arrayList, boolean z) {
            this.b = str;
            this.c = arrayList;
            this.d = z;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class g<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ xa40 b;

        public g(xa40 xa40Var) {
            this.b = xa40Var;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    public static void a(f1u f1uVar, m7a m7aVar) {
        final TabsState.EditModeState editModeState = new TabsState.EditModeState(false, 1, null);
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.MusicHorizontalTabsFilters;
        g2a g2aVar = new g2a(new yzs() { // from class: com.vk.catalog.mvi.block.music.impl.filters.b
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                List<CatalogFilterOptionDo> e2;
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogBlockVariant catalogBlockVariant2 = (CatalogBlockVariant) obj3;
                CatalogFilterDo catalogFilterDo = (CatalogFilterDo) j5g.a0(p4a.a(catalogBlockDto, BaseLinkButtonActionTypeDto.SHOW_FILTERS));
                String id = catalogBlockDto.getId();
                if (catalogFilterDo == null || (e2 = catalogFilterDo.e()) == null) {
                    return null;
                }
                return new MusicTabsFiltersView.TabsState(id, catalogBlockVariant2, e2, MusicTabsFiltersView.TabsState.EditModeState.this, null);
            }
        });
        xa40 xa40Var = new xa40(m7aVar, 2);
        com.vk.catalog.mvi.block.music.impl.filters.a aVar = new com.vk.catalog.mvi.block.music.impl.filters.a();
        a aVar2 = new a();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(TabsState.class, new g(xa40Var));
        f1uVar.h(TabsState.class, aVar);
        f1uVar.g(f.class, aVar2);
    }
}
