package com.vk.narratives.impl.highlights;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.HighlightLocalCustomCover;
import com.vk.dto.narratives.HighlightRemoteCustomCover;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.arf;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.dhr0;
import xsna.dnh;
import xsna.enh;
import xsna.epx;
import xsna.f5h0;
import xsna.fpf0;
import xsna.g1j;
import xsna.gko;
import xsna.gzs;
import xsna.hxl0;
import xsna.i5v;
import xsna.iah0;
import xsna.j5v;
import xsna.kgb;
import xsna.msy;
import xsna.ojt;
import xsna.p5h;
import xsna.p5j;
import xsna.q5f;
import xsna.qcy;
import xsna.r4v;
import xsna.s3q0;
import xsna.s4v;
import xsna.t2l;
import xsna.t4v;
import xsna.tlo0;
import xsna.tq;
import xsna.up2;
import xsna.vif0;
import xsna.zif0;

/* compiled from: HighlightChooseCoverFragment.kt */
/* loaded from: classes3.dex */
public final class HighlightChooseCoverFragment extends FragmentImpl {
    public static final /* synthetic */ int R = 0;
    public Object O;
    public UserId N = UserId.d;
    public final bpn0 P = new bpn0(new q5f(this, 26));
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new enh(this, 18));

    /* compiled from: HighlightChooseCoverFragment.kt */
    public static final class a extends vif0<t4v> implements View.OnClickListener {
        public final g1j n;
        public final VKImageView o;
        public final MaterialCheckBox p;

        public a(ViewGroup viewGroup, g1j g1jVar) {
            super(viewGroup, R.layout.item_highlight_custom_cover, 0);
            this.n = g1jVar;
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.custom_cover);
            this.o = vKImageView;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.itemView.findViewById(R.id.check);
            this.p = materialCheckBox;
            this.itemView.setOnClickListener(this);
            materialCheckBox.setUseMaterialThemeColors(false);
            bwt0.p0(materialCheckBox, true);
            vKImageView.setOnLoadCallback(new com.vk.narratives.impl.highlights.a(this));
            ojt ojtVar = new ojt(b6());
            ojtVar.l = f5h0.i.a;
            vKImageView.setHierarchy(ojtVar.a());
        }

        @Override // xsna.vif0
        public final void i6(t4v t4vVar) {
            t4v t4vVar2 = t4vVar;
            this.o.O0(t4vVar2.a.f(), ImageScreenSize.VERY_BIG);
            this.p.setChecked(t4vVar2.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.p.setChecked(true);
            this.n.invoke(((t4v) this.m).a);
        }
    }

    /* compiled from: HighlightChooseCoverFragment.kt */
    public static final class b extends vif0<i5v> implements View.OnClickListener {
        public final gzs<s3q0> n;
        public final View o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, t2l t2lVar) {
            super(viewGroup, i5v.b, 0);
            i5v.a.getClass();
            this.n = t2lVar;
            View findViewById = this.itemView.findViewById(R.id.container_bounds);
            this.o = findViewById;
            this.itemView.setOnClickListener(this);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            StringBuilder sb = new StringBuilder();
            sb.append(iah0.v());
            sb.append(':');
            sb.append(iah0.u());
            bVar.G = sb.toString();
            findViewById.setLayoutParams(bVar);
        }

        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(i5v i5vVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.n.invoke();
        }
    }

    /* compiled from: HighlightChooseCoverFragment.kt */
    public static final class c extends x<zif0, vif0<?>> {
        public static final /* synthetic */ qcy<Object>[] g = {new MutablePropertyReference1Impl(c.class, "customCover", "getCustomCover()Lcom/vk/dto/narratives/HighlightCover;", 0), p5j.a(0, c.class, "selectedCover", "getSelectedCover()Lcom/vk/dto/narratives/HighlightCover;", fpf0.a)};
        public static final a h = new a();
        public final List<StoryEntry> c;
        public final t2l d;
        public final r4v e;
        public final s4v f;

        /* compiled from: HighlightChooseCoverFragment.kt */
        public static final class a extends m.e<zif0> {
            @Override // androidx.recyclerview.widget.m.e
            public final boolean areContentsTheSame(zif0 zif0Var, zif0 zif0Var2) {
                return zif0Var2.equals(zif0Var);
            }

            @Override // androidx.recyclerview.widget.m.e
            public final boolean areItemsTheSame(zif0 zif0Var, zif0 zif0Var2) {
                return zif0Var.a() == zif0Var2.a();
            }
        }

        public c(HighlightCover highlightCover, List list, t2l t2lVar) {
            super(h);
            this.c = list;
            this.d = t2lVar;
            HighlightCover highlightCover2 = null;
            if (highlightCover != null && ((highlightCover instanceof HighlightLocalCustomCover) || (highlightCover instanceof HighlightRemoteCustomCover))) {
                highlightCover2 = highlightCover;
            }
            this.e = new r4v(highlightCover2, this);
            this.f = new s4v(highlightCover, this);
            submitList(x0());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return getItem(i).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            vif0 vif0Var = (vif0) e0Var;
            zif0 item = getItem(i);
            if (vif0Var instanceof b) {
                ((b) vif0Var).V5((i5v) item);
                return;
            }
            if (vif0Var instanceof a) {
                ((a) vif0Var).V5((t4v) item);
            } else if (vif0Var instanceof d) {
                ((d) vif0Var).V5((j5v) item);
            } else {
                throw new IllegalStateException(("Unknown holder: " + vif0Var).toString());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            i5v.a.getClass();
            if (i == i5v.b) {
                return new b(viewGroup, this.d);
            }
            if (i == R.layout.item_highlight_custom_cover) {
                return new a(viewGroup, new g1j(this, 14));
            }
            if (i == R.layout.item_story_archive) {
                return new d(viewGroup, new arf(this, 18));
            }
            throw new IllegalStateException(("Unknown viewType: " + i).toString());
        }

        public final ArrayList x0() {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(i5v.a);
            qcy<?>[] qcyVarArr = g;
            qcy<?> qcyVar = qcyVarArr[0];
            r4v r4vVar = this.e;
            if (r4vVar.getValue(this, qcyVar) != null) {
                arrayList.add(new t4v(r4vVar.getValue(this, qcyVarArr[0]), epx.f(r4vVar.getValue(this, qcyVarArr[0]), y0())));
            }
            List<StoryEntry> list = this.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (StoryEntry storyEntry : list) {
                HighlightCover y0 = y0();
                if (y0 != null) {
                    int i = storyEntry.c;
                    Integer o = up2.o(y0);
                    if (o != null && i == o.intValue()) {
                        z = true;
                        arrayList2.add(new j5v(storyEntry, z));
                    }
                }
                z = false;
                arrayList2.add(new j5v(storyEntry, z));
            }
            arrayList.addAll(arrayList2);
            return arrayList;
        }

        public final HighlightCover y0() {
            return this.f.getValue(this, g[1]);
        }
    }

    /* compiled from: HighlightChooseCoverFragment.kt */
    public static final class d extends vif0<j5v> implements View.OnClickListener {
        public final arf n;
        public final VKImageView o;
        public final MaterialCheckBox p;

        public d(ViewGroup viewGroup, arf arfVar) {
            super(viewGroup, R.layout.item_story_archive, 0);
            this.n = arfVar;
            VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
            this.o = vKImageView;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.itemView.findViewById(R.id.check);
            this.p = materialCheckBox;
            this.itemView.setOnClickListener(this);
            materialCheckBox.setUseMaterialThemeColors(false);
            bwt0.p0(materialCheckBox, true);
            ViewGroup.LayoutParams layoutParams = vKImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            StringBuilder sb = new StringBuilder();
            sb.append(iah0.v());
            sb.append(':');
            sb.append(iah0.u());
            bVar.G = sb.toString();
            vKImageView.setLayoutParams(bVar);
            vKImageView.getHierarchy().q(0);
            vKImageView.setPlaceholderImage(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        }

        @Override // xsna.vif0
        public final void i6(j5v j5vVar) {
            j5v j5vVar2 = j5vVar;
            this.p.setChecked(j5vVar2.b);
            VKImageView vKImageView = this.o;
            if (vKImageView.getWidth() != 0) {
                vKImageView.load(j5vVar2.a.Jb(vKImageView.getWidth(), ImageQuality.FIT, false));
            } else {
                vKImageView.post(new kgb(4, this, j5vVar2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.p.setChecked(true);
            this.n.invoke(((j5v) this.m).a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Photo photo;
        ?? r1 = this.Q;
        if (i == 1234 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra(X3.i.b);
            c cVar = (c) r1.getValue();
            cVar.e.setValue(cVar, c.g[0], new HighlightLocalCustomCover(stringExtra, null, null, 6, null));
            return;
        }
        if (i == 1235 && i2 == -1 && intent != null) {
            HighlightCover y0 = ((c) r1.getValue()).y0();
            Integer num = null;
            Integer o = y0 != null ? up2.o(y0) : null;
            HighlightCover y02 = ((c) r1.getValue()).y0();
            if (y02 != null) {
                if (y02 instanceof HighlightLocalCustomCover) {
                    num = ((HighlightLocalCustomCover) y02).c;
                } else if ((y02 instanceof HighlightRemoteCustomCover) && (photo = ((HighlightRemoteCustomCover) y02).c) != null) {
                    num = Integer.valueOf(photo.c);
                }
            }
            if (o != null) {
                intent.putExtra("RESULT_STORY_ID", o.intValue());
            }
            if (num != null) {
                intent.putExtra("RESULT_PHOTO_ID", num.intValue());
            }
            Mf(-1, intent);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserId userId = (UserId) requireArguments.getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        this.N = userId;
        Object integerArrayList = requireArguments.getIntegerArrayList("EXTRA_STORY_IDS");
        if (integerArrayList == null) {
            integerArrayList = EmptyList.b;
        }
        this.O = integerArrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_highlight_choose_cover, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.topbar);
        vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.accessibility_cancel), new dnh(this, 28), null, null, 12));
        Object[] objArr = 0 == true ? 1 : 0;
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.highlight_choose_cover), objArr, null, null, null, 30), cVar, objArr2, objArr3, 14));
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_outline_28), new tlo0.f(R.string.accessibility_done), new p5h(this, 22), null, 0 == true ? 1 : 0, null, 56), null, 6));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.covers);
        recyclerView.setHasFixedSize(true);
        requireContext();
        recyclerView.setLayoutManager(new GridLayoutManager(3, 1));
        recyclerView.addItemDecoration(new hxl0(0, 7));
        recyclerView.setAdapter((c) this.Q.getValue());
    }
}
