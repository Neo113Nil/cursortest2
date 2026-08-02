package com.vk.photogallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vk.imageloader.ImageScreenSize;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.an10;
import xsna.axz;
import xsna.bwt0;
import xsna.c5g;
import xsna.drm0;
import xsna.ej0;
import xsna.f4m;
import xsna.f5t;
import xsna.h9a0;
import xsna.i9a0;
import xsna.iah0;
import xsna.izs;
import xsna.j9a0;
import xsna.js6;
import xsna.k5t;
import xsna.l890;
import xsna.q010;
import xsna.q4t;
import xsna.q520;
import xsna.rei0;
import xsna.s3q0;
import xsna.uut0;
import xsna.vv20;
import xsna.x620;

/* compiled from: PhotoGalleryView.kt */
/* loaded from: classes4.dex */
public final class PhotoGalleryView extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public final rei0 b;
    public List<? extends f5t> c;
    public final ViewPager d;
    public final int e;
    public int f;
    public final ImageScreenSize g;
    public final boolean h;
    public boolean i;
    public final c j;
    public izs<? super q4t, Boolean> k;
    public izs<? super Integer, Integer> l;

    /* compiled from: PhotoGalleryView.kt */
    public static abstract class b {
        public final boolean a;

        /* compiled from: PhotoGalleryView.kt */
        public static final class a extends b {
            public final izs<List<? extends q4t>, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super List<? extends q4t>, s3q0> izsVar) {
                super(true);
                this.b = izsVar;
            }
        }

        /* compiled from: PhotoGalleryView.kt */
        /* renamed from: com.vk.photogallery.PhotoGalleryView$b$b, reason: collision with other inner class name */
        public static final class C1474b extends b {
            public final izs<q4t, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public C1474b(izs<? super q4t, s3q0> izsVar) {
                super(false);
                this.b = izsVar;
            }
        }

        /* compiled from: PhotoGalleryView.kt */
        public static final class c extends b {
        }

        public b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: PhotoGalleryView.kt */
    public final class c extends PagerAdapter {
        public List<? extends f5t> b;
        public final SparseArray<j9a0> c = new SparseArray<>();
        public int d;
        public j9a0 e;
        public a f;
        public izs<? super Integer, Integer> g;

        public c(ArrayList arrayList, izs izsVar) {
            this.b = arrayList;
            this.g = izsVar;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            j9a0 j9a0Var = this.c.get(i);
            if (j9a0Var != null) {
                uut0 uut0Var = j9a0Var.f;
                uut0Var.h.dispose();
                uut0Var.h = new f(io.reactivex.rxjava3.internal.functions.a.b);
                uut0Var.i.removeCallbacksAndMessages(null);
                io.reactivex.rxjava3.disposables.c cVar = uut0Var.k;
                if (cVar != null) {
                    cVar.dispose();
                }
            }
            viewGroup.removeViewAt(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.b.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.b.get(i).getDefaultAlbumName(PhotoGalleryView.this.getContext());
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            f5t f5tVar = this.b.get(i);
            PhotoGalleryView photoGalleryView = PhotoGalleryView.this;
            int i2 = photoGalleryView.e;
            j9a0 j9a0Var = new j9a0(context, f5tVar, i2, photoGalleryView.g, photoGalleryView.getSelectionState(), new q010(photoGalleryView, 14), i, photoGalleryView.h, this.g);
            this.c.put(i, j9a0Var);
            View inflate = LayoutInflater.from(context).inflate(R.layout.lg_layout, viewGroup, false);
            viewGroup.addView(inflate);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.lg_recycler);
            j9a0Var.h = recyclerView;
            GridLayoutManager gridLayoutManager = j9a0Var.e;
            recyclerView.setLayoutManager(gridLayoutManager);
            RecyclerView recyclerView2 = j9a0Var.h;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setAdapter(j9a0Var.d);
            RecyclerView recyclerView3 = j9a0Var.h;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.setItemAnimator(null);
            RecyclerView recyclerView4 = j9a0Var.h;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.setClipToPadding(false);
            RecyclerView recyclerView5 = j9a0Var.h;
            if (recyclerView5 == null) {
                recyclerView5 = null;
            }
            int i3 = i2 / 2;
            recyclerView5.addItemDecoration(new l890(i3));
            RecyclerView recyclerView6 = j9a0Var.h;
            if (recyclerView6 == null) {
                recyclerView6 = null;
            }
            bwt0.h(recyclerView6, new vv20(j9a0Var, 12));
            RecyclerView recyclerView7 = j9a0Var.h;
            if (recyclerView7 == null) {
                recyclerView7 = null;
            }
            recyclerView7.addOnScrollListener(new h9a0(j9a0Var));
            RecyclerView recyclerView8 = j9a0Var.h;
            if (recyclerView8 == null) {
                recyclerView8 = null;
            }
            i9a0 i9a0Var = new i9a0(j9a0Var, recyclerView8);
            j9a0Var.k = i9a0Var;
            RecyclerView recyclerView9 = j9a0Var.h;
            if (recyclerView9 == null) {
                recyclerView9 = null;
            }
            recyclerView9.addOnItemTouchListener(i9a0Var);
            gridLayoutManager.setSpanCount(an10.b(viewGroup.getMeasuredWidth() / r4.h()));
            RecyclerView recyclerView10 = j9a0Var.h;
            RecyclerView recyclerView11 = recyclerView10 != null ? recyclerView10 : null;
            int i4 = -i3;
            recyclerView11.setPadding(i4, i4, i4, i4);
            j9a0Var.i = (ProgressWheel) inflate.findViewById(R.id.lg_progress);
            TextView textView = (TextView) inflate.findViewById(R.id.lg_empty_gallery_text);
            j9a0Var.j = textView;
            f4m.j(textView);
            uut0 uut0Var = j9a0Var.f;
            uut0Var.a(uut0Var.j.c, 0);
            return inflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return obj.equals(view);
        }

        public final void onPageSelected(int i) {
            this.d = i;
            SparseArray<j9a0> sparseArray = this.c;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                j9a0 valueAt = sparseArray.valueAt(i2);
                uut0 uut0Var = valueAt.f;
                a.a.getClass();
                a.C1472a.C1473a c1473a = a.C1472a.b;
                uut0Var.d = c1473a;
                ej0 ej0Var = valueAt.d;
                c1473a.g();
                ej0Var.f = true;
                ej0Var.notifyDataSetChanged();
            }
            j9a0 j9a0Var = sparseArray.get(i);
            if (j9a0Var != null) {
                a aVar = this.f;
                uut0 uut0Var2 = j9a0Var.f;
                if (aVar == null) {
                    a.a.getClass();
                    aVar = a.C1472a.b;
                }
                uut0Var2.d = aVar;
                ej0 ej0Var2 = j9a0Var.d;
                ej0Var2.f = aVar.g().a;
                ej0Var2.notifyDataSetChanged();
            }
            j9a0 j9a0Var2 = sparseArray.get(i);
            this.e = j9a0Var2;
            if (j9a0Var2 != null) {
                int i3 = PhotoGalleryView.this.f;
                RecyclerView recyclerView = j9a0Var2.h;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                f4m.v(i3, recyclerView);
                RecyclerView recyclerView2 = j9a0Var2.h;
                (recyclerView2 != null ? recyclerView2 : null).setClipToPadding(i3 == 0);
            }
            j9a0 j9a0Var3 = this.e;
            if (j9a0Var3 != null) {
                k5t a = j9a0Var3.g.a();
                a aVar2 = this.f;
                if (aVar2 != null) {
                    aVar2.d(a);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        rei0 rei0Var = new rei0();
        rei0Var.a = new ArrayList<>();
        this.b = rei0Var;
        this.c = EmptyList.b;
        this.e = iah0.a(2);
        ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_120DP;
        this.g = imageScreenSize;
        this.h = true;
        this.i = true;
        this.k = new q520(10);
        this.l = new axz(context, 1);
        str = "com.vk.photogallery.LocalMediaGalleryProvider";
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            this.e = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            switch (obtainStyledAttributes.getInt(4, 14)) {
                case 0:
                    imageScreenSize = ImageScreenSize.VERY_SMALL;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string = obtainStyledAttributes.getString(2);
                    str = string != null ? string : "com.vk.photogallery.LocalMediaGalleryProvider";
                    obtainStyledAttributes.recycle();
                    break;
                case 1:
                    imageScreenSize = ImageScreenSize.SMALL;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string2 = obtainStyledAttributes.getString(2);
                    if (string2 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 2:
                    imageScreenSize = ImageScreenSize.MID;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string22 = obtainStyledAttributes.getString(2);
                    if (string22 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 3:
                    imageScreenSize = ImageScreenSize.BIG;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string222 = obtainStyledAttributes.getString(2);
                    if (string222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 4:
                    imageScreenSize = ImageScreenSize.VERY_BIG;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string2222 = obtainStyledAttributes.getString(2);
                    if (string2222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 5:
                    imageScreenSize = ImageScreenSize.SIZE_16DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string22222 = obtainStyledAttributes.getString(2);
                    if (string22222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 6:
                    imageScreenSize = ImageScreenSize.SIZE_20DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string222222 = obtainStyledAttributes.getString(2);
                    if (string222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 7:
                    imageScreenSize = ImageScreenSize.SIZE_24DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string2222222 = obtainStyledAttributes.getString(2);
                    if (string2222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 8:
                    imageScreenSize = ImageScreenSize.SIZE_28DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string22222222 = obtainStyledAttributes.getString(2);
                    if (string22222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 9:
                    imageScreenSize = ImageScreenSize.SIZE_32DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string222222222 = obtainStyledAttributes.getString(2);
                    if (string222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 10:
                    imageScreenSize = ImageScreenSize.SIZE_36DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string2222222222 = obtainStyledAttributes.getString(2);
                    if (string2222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 11:
                    imageScreenSize = ImageScreenSize.SIZE_44DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string22222222222 = obtainStyledAttributes.getString(2);
                    if (string22222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 12:
                    imageScreenSize = ImageScreenSize.SIZE_48DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string222222222222 = obtainStyledAttributes.getString(2);
                    if (string222222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 13:
                    imageScreenSize = ImageScreenSize.SIZE_56DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string2222222222222 = obtainStyledAttributes.getString(2);
                    if (string2222222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 14:
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string22222222222222 = obtainStyledAttributes.getString(2);
                    if (string22222222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                case 15:
                    imageScreenSize = ImageScreenSize.SIZE_160DP;
                    this.g = imageScreenSize;
                    this.h = obtainStyledAttributes.getBoolean(5, true);
                    String string222222222222222 = obtainStyledAttributes.getString(2);
                    if (string222222222222222 != null) {
                    }
                    obtainStyledAttributes.recycle();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported preferred item size");
            }
        }
        List c0 = drm0.c0(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            arrayList.add((f5t) Class.forName((String) it.next()).newInstance());
        }
        c cVar = new c(arrayList, this.l);
        this.j = cVar;
        ViewPager viewPager = new ViewPager(context);
        this.d = viewPager;
        viewPager.setAdapter(cVar);
        viewPager.addOnPageChangeListener(new com.vk.photogallery.a(this));
        addView(viewPager);
        post(new js6(this, 5));
    }

    public final izs<Integer, Integer> getColorProvider() {
        return this.l;
    }

    public final izs<q4t, Boolean> getEntryFilter() {
        return this.k;
    }

    public final List<f5t> getGalleryProviders() {
        return this.c;
    }

    public final rei0 getSelectionState() {
        return this.b;
    }

    public final k5t getState() {
        j9a0 j9a0Var = this.j.e;
        return j9a0Var != null ? j9a0Var.g.a() : new k5t(0);
    }

    public final ViewPager getViewPager() {
        return this.d;
    }

    public final void setBottomPadding(int i) {
        this.f = i;
        j9a0 j9a0Var = this.j.e;
        if (j9a0Var != null) {
            RecyclerView recyclerView = j9a0Var.h;
            if (recyclerView == null) {
                recyclerView = null;
            }
            f4m.v(i, recyclerView);
            RecyclerView recyclerView2 = j9a0Var.h;
            (recyclerView2 != null ? recyclerView2 : null).setClipToPadding(i == 0);
        }
    }

    public final void setCallback(a aVar) {
        c cVar = this.j;
        cVar.f = aVar;
        cVar.onPageSelected(cVar.d);
    }

    public final void setColorProvider(izs<? super Integer, Integer> izsVar) {
        this.l = izsVar;
        c cVar = this.j;
        cVar.g = izsVar;
        SparseArray<j9a0> sparseArray = cVar.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ej0 ej0Var = sparseArray.valueAt(i).d;
            ej0Var.i = izsVar;
            ej0Var.notifyDataSetChanged();
        }
    }

    public final void setEntryFilter(izs<? super q4t, Boolean> izsVar) {
        this.k = izsVar;
        Iterator<T> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f5t f5tVar = (f5t) it.next();
            LocalGalleryProvider localGalleryProvider = f5tVar instanceof LocalGalleryProvider ? (LocalGalleryProvider) f5tVar : null;
            if (localGalleryProvider != null) {
                localGalleryProvider.setEntryFilter(this.k);
            }
        }
        c cVar = this.j;
        for (f5t f5tVar2 : cVar.b) {
            LocalGalleryProvider localGalleryProvider2 = f5tVar2 instanceof LocalGalleryProvider ? (LocalGalleryProvider) f5tVar2 : null;
            if (localGalleryProvider2 != null) {
                localGalleryProvider2.setEntryFilter(this.k);
            }
        }
        cVar.notifyDataSetChanged();
    }

    public final void setGalleryProviders(List<? extends f5t> list) {
        this.c = list;
        for (f5t f5tVar : list) {
            LocalGalleryProvider localGalleryProvider = f5tVar instanceof LocalGalleryProvider ? (LocalGalleryProvider) f5tVar : null;
            if (localGalleryProvider != null) {
                localGalleryProvider.setEntryFilter(this.k);
            }
        }
        c cVar = this.j;
        cVar.b = list;
        cVar.notifyDataSetChanged();
    }

    public final void setIsMultiSelectEnabled(boolean z) {
        this.i = z;
    }

    /* compiled from: PhotoGalleryView.kt */
    public interface a {
        public static final C1472a a = C1472a.a;

        default Rect a() {
            return null;
        }

        default View e(ViewGroup viewGroup) {
            return null;
        }

        default WindowManager.LayoutParams f() {
            return null;
        }

        default b g() {
            return new b.a(new x620(10));
        }

        /* compiled from: PhotoGalleryView.kt */
        /* renamed from: com.vk.photogallery.PhotoGalleryView$a$a, reason: collision with other inner class name */
        public static final class C1472a {
            public static final /* synthetic */ C1472a a = new C1472a();
            public static final C1473a b = new C1473a();

            /* compiled from: PhotoGalleryView.kt */
            /* renamed from: com.vk.photogallery.PhotoGalleryView$a$a$a, reason: collision with other inner class name */
            public static final class C1473a implements a {
                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final Rect a() {
                    return null;
                }

                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final View e(ViewGroup viewGroup) {
                    return null;
                }

                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final WindowManager.LayoutParams f() {
                    return null;
                }

                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final void h() {
                }

                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final void b(int i) {
                }

                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final void c(PhotoViewer photoViewer) {
                }

                @Override // com.vk.photogallery.PhotoGalleryView.a
                public final void d(k5t k5tVar) {
                }
            }
        }

        default void h() {
        }

        default void b(int i) {
        }

        default void c(PhotoViewer photoViewer) {
        }

        default void d(k5t k5tVar) {
        }
    }
}
