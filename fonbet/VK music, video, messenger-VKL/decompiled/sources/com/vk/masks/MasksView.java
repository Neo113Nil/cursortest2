package com.vk.masks;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.masks.MaskSection;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.DefaultErrorView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.masks.MasksView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.bi10;
import xsna.bn10;
import xsna.drm0;
import xsna.e3m;
import xsna.ee;
import xsna.ef2;
import xsna.epx;
import xsna.gkf0;
import xsna.iah0;
import xsna.j9x;
import xsna.l38;
import xsna.pd90;
import xsna.qq2;
import xsna.swe0;
import xsna.whp;
import xsna.xg10;

/* compiled from: MasksView.kt */
/* loaded from: classes3.dex */
public final class MasksView extends FrameLayout {
    public static final int j = iah0.a(12);
    public static final float k = 0.7f;
    public static final int l = iah0.a(56);
    public final int b;
    public final Handler c;
    public final c d;
    public final FrameLayout e;
    public final HashMap<MaskSection, View> f;
    public final ArrayList<MaskSection> g;
    public final HashMap<MaskSection, View> h;
    public final ArrayList<View> i;

    /* compiled from: MasksView.kt */
    public static final class a extends RecyclerView.t {
        public final MasksView b;

        public a(MasksView masksView) {
            this.b = masksView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3 = MasksView.j;
            this.b.b(recyclerView, 8);
        }
    }

    /* compiled from: MasksView.kt */
    public final class b extends LinearLayout {
        public MaskSection b;
        public final VKImageView c;
        public final VkText d;

        /* compiled from: MasksView.kt */
        public static final class a extends v {
            @Override // androidx.recyclerview.widget.v
            public final int getHorizontalSnapPreference() {
                return -1;
            }
        }

        public b(MasksView masksView, Context context) {
            super(context);
            setOrientation(0);
            LayoutInflater.from(getContext()).inflate(R.layout.layout_section_header, (ViewGroup) this, true);
            setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            this.c = (VKImageView) findViewById(R.id.iv_section_icon);
            this.d = (VkText) findViewById(R.id.tv_section_name);
            setOnClickListener(new l38(1, masksView, this));
        }

        public final void a(MaskSection maskSection) {
            if (epx.f(this.b, maskSection)) {
                MaskSection maskSection2 = this.b;
                if (epx.f(maskSection2 != null ? Integer.valueOf(maskSection2.f) : null, Integer.valueOf(maskSection.f))) {
                    return;
                }
            }
            this.b = maskSection;
            String str = maskSection.d;
            VKImageView vKImageView = this.c;
            if (vKImageView != null) {
                vKImageView.setVisibility(0);
            }
            if (vKImageView != null) {
                vKImageView.load(maskSection.c);
            }
            VkText vkText = this.d;
            if (str == null || drm0.N(str) || maskSection.f < 2) {
                if (vkText != null) {
                    vkText.setVisibility(8);
                }
            } else {
                if (vkText != null) {
                    vkText.setVisibility(0);
                }
                if (vkText != null) {
                    vkText.setText(str);
                }
            }
        }
    }

    /* compiled from: MasksView.kt */
    public static final class c extends RecyclerPaginatedView {

        /* compiled from: MasksView.kt */
        public static final class a extends DefaultErrorView {
            @Override // com.vk.lists.DefaultErrorView
            public int getLayoutId() {
                return R.layout.masks_error;
            }
        }

        public c(Context context) {
            super(context);
            setFooterErrorViewProvider(null);
        }

        @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
        public final void Fe() {
            super.Fe();
            MasksView.this.a(0);
        }

        @Override // com.vk.lists.AbstractPaginatedView
        public final ee d(Context context, AttributeSet attributeSet) {
            a aVar = new a(context, attributeSet);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, MasksView.this.b);
            int a2 = iah0.a(12.0f);
            layoutParams.gravity = 48;
            layoutParams.setMargins(a2, a2, a2, a2);
            aVar.setLayoutParams(layoutParams);
            return aVar;
        }

        @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
        public final void e0() {
            super.e0();
            MasksView.this.a(0);
        }

        @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
        public final void f0() {
            super.f0();
            MasksView.this.a(0);
        }

        @Override // com.vk.lists.AbstractPaginatedView
        public final void g0() {
            fj(null, null);
            MasksView.this.a(0);
        }

        @Override // com.vk.lists.AbstractPaginatedView
        public final View h(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.masks_loading, (ViewGroup) null);
            int i = MasksView.this.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 49;
            inflate.setLayoutParams(layoutParams);
            return inflate;
        }

        @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
        public final void lb() {
            super.lb();
            MasksView.this.a(0);
        }

        @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
        public final void qg(whp whpVar) {
            super.qg(whpVar);
            MasksView.this.a(0);
        }
    }

    static {
        iah0.a(8);
    }

    public MasksView(Context context) {
        super(context);
        int a2 = e3m.a(R.dimen.camera_masks_item_size, getContext());
        this.b = a2;
        this.c = new Handler(Looper.getMainLooper());
        c cVar = new c(getContext());
        this.d = cVar;
        this.e = new FrameLayout(getContext());
        this.f = new HashMap<>();
        int a3 = e3m.a(R.dimen.camera_masks_discover_top_margin, getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a2 * 3);
        layoutParams.gravity = 48;
        layoutParams.topMargin = a3;
        addView(cVar, layoutParams);
        float f = 12;
        cVar.getRecyclerView().setPadding(iah0.a(f), iah0.a(10), iah0.a(f), 0);
        cVar.getRecyclerView().setClipToPadding(false);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, cVar);
        dVar.f = 0;
        dVar.a();
        cVar.setSwipeRefreshEnabled(false);
        cVar.getRecyclerView().addOnScrollListener(new a(this));
        this.g = new ArrayList<>(10);
        this.h = new HashMap<>(10);
        this.i = new ArrayList<>(10);
    }

    public final void a(final int i) {
        ef2 ef2Var = new ef2(this, 13);
        Handler handler = this.c;
        handler.post(ef2Var);
        handler.post(new Runnable() { // from class: xsna.ji10
            @Override // java.lang.Runnable
            public final void run() {
                MasksView masksView = MasksView.this;
                masksView.b(masksView.d.getRecyclerView(), i + 1);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: Exception -> 0x0213, TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: Exception -> 0x0213, LOOP:1: B:29:0x008f->B:35:0x00ba, LOOP_START, PHI: r8
      0x008f: PHI (r8v23 int) = (r8v0 int), (r8v24 int) binds: [B:28:0x008d, B:35:0x00ba] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[Catch: Exception -> 0x0213, TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9 A[Catch: Exception -> 0x0213, TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110 A[Catch: Exception -> 0x0213, TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144 A[Catch: Exception -> 0x0213, TRY_ENTER, TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158 A[Catch: Exception -> 0x0213, TryCatch #0 {Exception -> 0x0213, blocks: (B:4:0x0010, B:7:0x001c, B:8:0x0042, B:10:0x0047, B:12:0x005c, B:15:0x0063, B:19:0x0069, B:21:0x006d, B:23:0x007b, B:25:0x0081, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:35:0x00ba, B:37:0x00a2, B:39:0x00a6, B:41:0x00b1, B:42:0x00b5, B:45:0x00bd, B:47:0x00c4, B:49:0x00d2, B:51:0x00ec, B:52:0x00dc, B:55:0x00f2, B:57:0x00f9, B:59:0x0103, B:61:0x0106, B:64:0x0109, B:66:0x0110, B:68:0x011c, B:69:0x011f, B:71:0x0125, B:73:0x012e, B:74:0x012b, B:79:0x0135, B:82:0x0139, B:85:0x0144, B:87:0x0158, B:89:0x015e, B:91:0x0165, B:93:0x0171, B:95:0x017d, B:96:0x0183, B:98:0x018b, B:102:0x018e, B:105:0x0197, B:107:0x01ab, B:108:0x01b1, B:110:0x01ce, B:112:0x01d7, B:116:0x01da, B:118:0x01e0, B:132:0x020f), top: B:3:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i) {
        View view;
        Object obj;
        MaskSection maskSection;
        int size;
        int i2;
        int childCount;
        int i3;
        int size2;
        int i4;
        int size3;
        b bVar;
        MaskSection maskSection2;
        HashMap<MaskSection, View> hashMap = this.h;
        ArrayList<MaskSection> arrayList = this.g;
        ArrayList<View> arrayList2 = this.i;
        if (i > 10) {
            return;
        }
        try {
            int visibility = this.d.e.getVisibility();
            FrameLayout frameLayout = this.e;
            if (visibility != 0) {
                frameLayout.removeAllViews();
                return;
            }
            arrayList.clear();
            hashMap.clear();
            arrayList2.clear();
            xg10 xg10Var = (xg10) ((pd90) recyclerView.getAdapter()).c;
            int a2 = gkf0.a(recyclerView);
            int b2 = gkf0.b(recyclerView);
            j9x it = swe0.m(a2 - 1, 0).iterator();
            while (true) {
                view = null;
                if (!it.d) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Object c2 = xg10Var.c.c(((Number) obj).intValue());
                bi10.d dVar = c2 instanceof bi10.d ? (bi10.d) c2 : null;
                if (dVar != null && dVar.b != null) {
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                Object c3 = xg10Var.c.c(num.intValue());
                bi10.d dVar2 = c3 instanceof bi10.d ? (bi10.d) c3 : null;
                if (dVar2 != null) {
                    maskSection = dVar2.b;
                    if (maskSection != null) {
                        arrayList.add(maskSection);
                        hashMap.put(maskSection, null);
                    }
                    if (a2 <= b2) {
                        while (true) {
                            Object c4 = xg10Var.c.c(a2);
                            bi10.d dVar3 = c4 instanceof bi10.d ? (bi10.d) c4 : null;
                            if (dVar3 != null && (maskSection2 = dVar3.b) != null) {
                                arrayList.add(maskSection2);
                                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(a2);
                                hashMap.put(maskSection2, findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null);
                            }
                            if (a2 == b2) {
                                break;
                            } else {
                                a2++;
                            }
                        }
                    }
                    size = arrayList.size();
                    for (i2 = 0; i2 < size; i2++) {
                        MaskSection maskSection3 = arrayList.get(i2);
                        HashMap<MaskSection, View> hashMap2 = this.f;
                        if (hashMap2.containsKey(maskSection3)) {
                            bVar = (b) hashMap2.get(maskSection3);
                            bVar.a(maskSection3);
                        } else {
                            b bVar2 = new b(this, getContext());
                            bVar2.a(maskSection3);
                            hashMap2.put(maskSection3, bVar2);
                            bVar = bVar2;
                        }
                        arrayList2.add(bVar);
                    }
                    childCount = frameLayout.getChildCount();
                    for (i3 = 0; i3 < childCount; i3++) {
                        View childAt = frameLayout.getChildAt(i3);
                        if (!arrayList2.contains(childAt)) {
                            frameLayout.removeView(childAt);
                        }
                    }
                    size2 = arrayList2.size();
                    for (i4 = 0; i4 < size2; i4++) {
                        View view2 = arrayList2.get(i4);
                        if (view2.getParent() == null) {
                            frameLayout.addView(view2);
                        }
                        if (view2.getMeasuredWidth() == 0) {
                            view2.setVisibility(4);
                            view = view2;
                        } else {
                            view2.setVisibility(0);
                        }
                    }
                    if (i > 10 && view != null) {
                        a(i);
                        return;
                    }
                    size3 = arrayList2.size();
                    int i5 = j;
                    if (size3 != 1) {
                        arrayList2.get(0).setTranslationX(i5);
                        arrayList2.get(0).setAlpha(1.0f);
                        return;
                    }
                    if (arrayList2.size() > 1) {
                        int size4 = arrayList2.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            View view3 = arrayList2.get(i6);
                            if (view3.getMeasuredWidth() > 0) {
                                view3.setTranslationX(Math.max(i5, hashMap.get(arrayList.get(i6)) != null ? r10.getLeft() : i5));
                            }
                        }
                        for (int size5 = arrayList2.size() - 2; -1 < size5; size5--) {
                            View view4 = arrayList2.get(size5);
                            int i7 = size5 + 1;
                            float min = Math.min(hashMap.get(arrayList.get(i7)) != null ? r10.getLeft() : i5, arrayList2.get(i7).getTranslationX());
                            if (min < view4.getTranslationX() + view4.getMeasuredWidth()) {
                                view4.setTranslationX(min - view4.getMeasuredWidth());
                            }
                        }
                        int size6 = arrayList2.size();
                        for (int i8 = 0; i8 < size6; i8++) {
                            View view5 = arrayList2.get(i8);
                            float b3 = bn10.b(Math.min(view5.getMeasuredWidth(), l) / Math.max(i5, view5.getTranslationX()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            float f = k;
                            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = qq2.a;
                            view5.setAlpha(((b3 - 1.0f) * f) + 1.0f);
                        }
                        return;
                    }
                    return;
                }
            }
            maskSection = null;
            if (maskSection != null) {
            }
            if (a2 <= b2) {
            }
            size = arrayList.size();
            while (i2 < size) {
            }
            childCount = frameLayout.getChildCount();
            while (i3 < childCount) {
            }
            size2 = arrayList2.size();
            while (i4 < size2) {
            }
            if (i > 10) {
            }
            size3 = arrayList2.size();
            int i52 = j;
            if (size3 != 1) {
            }
        } catch (Exception unused) {
            a(i);
        }
    }

    public final RecyclerPaginatedView getPagindatedView() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            a(0);
        }
    }

    public final void setHeadersToIgnoreDeleteButtons(boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, e3m.a(R.dimen.camera_masks_section_view_height, getContext()));
        layoutParams.gravity = 48;
        if (z) {
            layoutParams.topMargin = e3m.a(R.dimen.camera_masks_delete_button_space, getContext());
        }
        this.e.setLayoutParams(layoutParams);
    }

    public MasksView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int a2 = e3m.a(R.dimen.camera_masks_item_size, getContext());
        this.b = a2;
        this.c = new Handler(Looper.getMainLooper());
        c cVar = new c(getContext());
        this.d = cVar;
        this.e = new FrameLayout(getContext());
        this.f = new HashMap<>();
        int a3 = e3m.a(R.dimen.camera_masks_discover_top_margin, getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a2 * 3);
        layoutParams.gravity = 48;
        layoutParams.topMargin = a3;
        addView(cVar, layoutParams);
        float f = 12;
        cVar.getRecyclerView().setPadding(iah0.a(f), iah0.a(10), iah0.a(f), 0);
        cVar.getRecyclerView().setClipToPadding(false);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, cVar);
        dVar.f = 0;
        dVar.a();
        cVar.setSwipeRefreshEnabled(false);
        cVar.getRecyclerView().addOnScrollListener(new a(this));
        this.g = new ArrayList<>(10);
        this.h = new HashMap<>(10);
        this.i = new ArrayList<>(10);
    }
}
