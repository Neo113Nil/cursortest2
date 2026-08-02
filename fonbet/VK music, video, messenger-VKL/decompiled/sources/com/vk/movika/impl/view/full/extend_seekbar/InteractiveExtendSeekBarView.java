package com.vk.movika.impl.view.full.extend_seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.impl.view.full.extend_seekbar.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import xsna.bcx;
import xsna.bh10;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.izs;
import xsna.owo0;
import xsna.s3q0;
import xsna.vu5;
import xsna.zjw;

/* compiled from: InteractiveExtendSeekBarView.kt */
/* loaded from: classes3.dex */
public final class InteractiveExtendSeekBarView extends FrameLayout {
    public final RecyclerView b;
    public final TextView c;
    public final com.vk.movika.impl.view.full.extend_seekbar.a d;
    public final int e;
    public Long f;
    public boolean g;
    public a h;
    public owo0 i;
    public zjw j;
    public bcx k;
    public izs<? super Long, s3q0> l;

    /* compiled from: InteractiveExtendSeekBarView.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final long c;

        public a(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(current=");
            sb.append(this.a);
            sb.append(", duration=");
            sb.append(this.b);
            sb.append(", maxSeekTime=");
            return vu5.a(')', this.c, sb);
        }
    }

    public InteractiveExtendSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        com.vk.movika.impl.view.full.extend_seekbar.a aVar = new com.vk.movika.impl.view.full.extend_seekbar.a();
        this.d = aVar;
        this.e = (int) getResources().getDimension(R.dimen.interactive_extend_seek_view_size);
        LayoutInflater.from(context).inflate(R.layout.interactive_extend_seek_bar, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.frames_recycler);
        this.b = recyclerView;
        this.c = (TextView) findViewById(R.id.extend_seek_full_additional_text);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.addOnScrollListener(new b(this));
    }

    public final void a(a aVar) {
        Long l;
        a aVar2 = this.h;
        long j = aVar2 != null ? aVar2.a : 0L;
        long j2 = aVar.a;
        long j3 = aVar.c;
        long j4 = aVar.a;
        Long l2 = this.f;
        int i = this.e;
        if (l2 != null) {
            long longValue = l2.longValue();
            if (longValue != 0) {
                float f = j2 - j;
                float f2 = i;
                float f3 = longValue;
                float f4 = (f * f2) / f3;
                RecyclerView recyclerView = this.b;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                float f5 = computeHorizontalScrollOffset > 0 ? ((j * f2) / f3) - computeHorizontalScrollOffset : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.g = true;
                try {
                    recyclerView.scrollBy((int) (f4 + f5), 0);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
                this.g = false;
            }
        }
        c(aVar);
        b(aVar, false);
        a aVar3 = this.h;
        if ((aVar3 == null || aVar3.a != j4 || aVar3.c != j3) && (l = this.f) != null) {
            float f6 = i;
            float longValue2 = l.longValue();
            this.c.setTranslationX((((((getWidth() / 2.0f) / f6) * longValue2) + (j3 - j4)) / longValue2) * f6);
        }
        this.h = aVar;
    }

    public final void b(a aVar, boolean z) {
        Long l;
        a aVar2 = this.h;
        if ((aVar2 == null || aVar2.b != aVar.b || aVar2 == null || aVar2.c != aVar.c || z) && (l = this.f) != null) {
            long longValue = l.longValue();
            Long valueOf = Long.valueOf(aVar.b);
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue2 = valueOf.longValue() - aVar.c;
                int min = (int) Math.min(getWidth() / 2, ((longValue2 >= 0 ? longValue2 : 0L) / longValue) * this.e);
                TextView textView = this.c;
                if (textView.getLayoutParams().width != min) {
                    f4m.p(min, textView);
                }
            }
        }
    }

    public final void c(a aVar) {
        owo0 owo0Var;
        a aVar2 = this.h;
        if ((aVar2 == null || aVar2.b != aVar.b) && (owo0Var = this.i) != null) {
            int i = owo0Var.e;
            long j = aVar.b;
            Long valueOf = Long.valueOf(j);
            if (j <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                long j2 = longValue / i;
                ListBuilder e = e43.e();
                for (int i2 = 0; i2 < i; i2++) {
                    e.add(new a.C1287a(i2 * j2, longValue, owo0Var));
                }
                ListBuilder g = e.g();
                this.f = Long.valueOf(j2);
                com.vk.movika.impl.view.full.extend_seekbar.a aVar3 = this.d;
                ArrayList arrayList = aVar3.c;
                arrayList.clear();
                arrayList.addAll(g);
                aVar3.notifyDataSetChanged();
            }
        }
    }

    public final bcx getActionConsumer() {
        return this.k;
    }

    public final zjw getImageLoader() {
        return this.j;
    }

    public final izs<Long, s3q0> getSeekStateListener() {
        return this.l;
    }

    public final owo0 getTimelineImages() {
        return this.i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a aVar = this.h;
        if (aVar != null) {
            b(aVar, z);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b.setPadding(getMeasuredWidth() / 2, 0, getMeasuredWidth() / 2, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.h;
        if (aVar != null) {
            a(aVar);
        }
    }

    public final void setActionConsumer(bcx bcxVar) {
        this.k = bcxVar;
    }

    public final void setImageLoader(zjw zjwVar) {
        this.d.d = zjwVar;
        this.j = zjwVar;
    }

    public final void setSeekStateListener(izs<? super Long, s3q0> izsVar) {
        this.l = izsVar;
    }

    public final void setTimelineImages(owo0 owo0Var) {
        if (epx.f(this.i, owo0Var)) {
            return;
        }
        this.i = owo0Var;
        a aVar = this.h;
        if (aVar != null) {
            c(aVar);
        }
    }
}
