package com.vk.photogallery;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.ContextThemeWrapper;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.ArrowSendButton;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.permission.PermissionHelper;
import com.vk.photogallery.PhotoGalleryView;
import com.vk.photogallery.c;
import com.vk.photogallery.view.CoordinatorLayoutWithContextMenuDelegate;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a06;
import xsna.a7u0;
import xsna.awt0;
import xsna.bq00;
import xsna.bwt0;
import xsna.cty;
import xsna.d3m;
import xsna.e3m;
import xsna.f5t;
import xsna.g22;
import xsna.g880;
import xsna.gz80;
import xsna.hg1;
import xsna.i9a0;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.j9a0;
import xsna.js00;
import xsna.k5t;
import xsna.l6u;
import xsna.l9a0;
import xsna.lw20;
import xsna.o44;
import xsna.o9a0;
import xsna.p350;
import xsna.q4t;
import xsna.qnj;
import xsna.r9a0;
import xsna.s1x;
import xsna.s3q0;
import xsna.s4p0;
import xsna.s9a0;
import xsna.t01;
import xsna.t9a0;
import xsna.tvo;
import xsna.u01;
import xsna.ubw;
import xsna.xo2;
import xsna.xz5;

/* compiled from: PhotoGalleryViewer.kt */
/* loaded from: classes4.dex */
public final class c {
    public final ContextThemeWrapper a;
    public final a7u0 b;
    public final List<f5t> c;
    public final GallerySelectionStrategy d;
    public final WindowManager e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final LayoutInflater g;
    public VkContextMenu h;
    public final CoordinatorLayoutWithContextMenuDelegate i;
    public final VKTabLayout j;
    public final View k;
    public final PhotoGalleryView l;
    public final View m;
    public final View n;
    public final View o;
    public final View p;
    public final EditText q;
    public final ImageView r;
    public final View s;
    public final View t;
    public final View u;
    public final View v;
    public final BottomConfirmButton w;
    public final ArrowSendButton x;
    public final View y;
    public final BottomSheetBehavior<View> z;

    /* compiled from: PhotoGalleryViewer.kt */
    public static abstract class a {
    }

    /* compiled from: PhotoGalleryViewer.kt */
    public final class b implements PhotoGalleryView.a {
        public PhotoViewer b;
        public TextView c;
        public ArrowSendButton d;
        public EditText e;
        public ImageView f;
        public View g;
        public Rect h;
        public o9a0 i;

        /* compiled from: PhotoGalleryViewer.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GallerySelectionStrategy.values().length];
                try {
                    iArr[GallerySelectionStrategy.MULTIPLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GallerySelectionStrategy.SINGLE_IMMEDIATELY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GallerySelectionStrategy.SINGLE_WITH_PREVIEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* compiled from: PhotoGalleryViewer.kt */
        /* renamed from: com.vk.photogallery.c$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C1475b extends FunctionReferenceImpl implements izs<List<? extends q4t>, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(List<? extends q4t> list) {
                c cVar = (c) this.receiver;
                ArrowSendButton arrowSendButton = cVar.x;
                View view = cVar.p;
                EditText editText = cVar.q;
                PhotoGalleryView photoGalleryView = cVar.l;
                if (photoGalleryView.getSelectionState().a.isEmpty()) {
                    if (editText.getText().length() == 0) {
                        d3m.e(cVar.q, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        d3m.e(cVar.r, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 50L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        bwt0.p0(view, false);
                    }
                    xo2.e(cVar.x, 150L, null, 13);
                } else if (bwt0.K(editText)) {
                    bwt0.p0(editText, false);
                    bwt0.p0(cVar.r, bwt0.K(editText));
                    bwt0.p0(view, bwt0.K(editText));
                }
                ArrowSendButton.a(arrowSendButton, photoGalleryView.getSelectionState().a.size());
                return s3q0.a;
            }
        }

        /* compiled from: PhotoGalleryViewer.kt */
        /* renamed from: com.vk.photogallery.c$b$c, reason: collision with other inner class name */
        public static final /* synthetic */ class C1476c extends FunctionReferenceImpl implements izs<q4t, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(q4t q4tVar) {
                q4t q4tVar2 = q4tVar;
                c cVar = (c) this.receiver;
                if (cVar.d == GallerySelectionStrategy.SINGLE_IMMEDIATELY) {
                    cVar.b.a("", Collections.singletonList(q4tVar2));
                    cVar.b();
                }
                return s3q0.a;
            }
        }

        /* compiled from: PhotoGalleryViewer.kt */
        public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<q4t, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(q4t q4tVar) {
                q4t q4tVar2 = q4tVar;
                c cVar = (c) this.receiver;
                if (cVar.d == GallerySelectionStrategy.SINGLE_IMMEDIATELY) {
                    cVar.b.a("", Collections.singletonList(q4tVar2));
                    cVar.b();
                }
                return s3q0.a;
            }
        }

        public b() {
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final Rect a() {
            return this.h;
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void b(int i) {
            c cVar = c.this;
            PhotoGalleryView photoGalleryView = cVar.l;
            q4t q4tVar = (q4t) j5g.b0(i, photoGalleryView.getState().c().a);
            if (photoGalleryView.getSelectionState().c(q4tVar)) {
                TextView textView = this.c;
                if (textView == null) {
                    textView = null;
                }
                textView.setBackgroundResource(R.drawable.bg_selected_circle);
                TextView textView2 = this.c;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(String.valueOf(photoGalleryView.getSelectionState().b(q4tVar) + 1));
            } else {
                TextView textView3 = this.c;
                if (textView3 == null) {
                    textView3 = null;
                }
                textView3.setBackgroundResource(R.drawable.bg_unselected_circle);
                TextView textView4 = this.c;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText("");
            }
            EditText editText = this.e;
            if (editText == null) {
                editText = null;
            }
            editText.setVisibility(4);
            ImageView imageView = this.f;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setVisibility(4);
            int size = photoGalleryView.getSelectionState().a.size();
            boolean z = cVar.d != GallerySelectionStrategy.MULTIPLE;
            EditText editText2 = this.e;
            if (editText2 == null) {
                editText2 = null;
            }
            if (bwt0.K(editText2) || z) {
                ArrowSendButton arrowSendButton = this.d;
                if (arrowSendButton == null) {
                    arrowSendButton = null;
                }
                xo2.d(25, 150L, arrowSendButton);
            } else {
                ArrowSendButton arrowSendButton2 = this.d;
                if (arrowSendButton2 == null) {
                    arrowSendButton2 = null;
                }
                xo2.e(arrowSendButton2, 150L, null, 9);
            }
            ArrowSendButton arrowSendButton3 = this.d;
            ArrowSendButton.a(arrowSendButton3 != null ? arrowSendButton3 : null, size);
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void c(PhotoViewer photoViewer) {
            if (e3m.h(c.this.a) != null) {
                this.b = photoViewer;
            }
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void d(k5t k5tVar) {
            if (k5tVar.b().a.length() > 0) {
                c.a(c.this, k5tVar.b().a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v25, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.o9a0] */
        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final View e(final ViewGroup viewGroup) {
            final c cVar = c.this;
            EditText editText = cVar.q;
            boolean z = false;
            View inflate = cVar.g.inflate(R.layout.lg_photo_view_controls, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.lg_counter_container);
            this.g = findViewById;
            if (cVar.d == GallerySelectionStrategy.SINGLE_WITH_PREVIEW) {
                bwt0.p0(findViewById, false);
            }
            View view = this.g;
            if (view == null) {
                view = null;
            }
            bwt0.i0(view, new js00(8, this, cVar));
            this.c = (TextView) inflate.findViewById(R.id.lg_counter);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.lg_caption_icon);
            this.f = imageView;
            imageView.setImageDrawable(null);
            EditText editText2 = (EditText) inflate.findViewById(R.id.lg_caption_view);
            this.e = editText2;
            editText2.setText(editText.getText());
            EditText editText3 = this.e;
            if (editText3 == null) {
                editText3 = null;
            }
            editText3.setSelection(editText.getSelectionStart());
            EditText editText4 = this.e;
            if (editText4 == null) {
                editText4 = null;
            }
            awt0.h(editText4, new cty(this, 23), false);
            EditText editText5 = this.e;
            if (editText5 == null) {
                editText5 = null;
            }
            editText5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.m9a0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    if (z2) {
                        c.b bVar = c.b.this;
                        PhotoViewer photoViewer = bVar.b;
                        if (photoViewer != null) {
                            PhotoViewerLayout photoViewerLayout = photoViewer.w;
                            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) photoViewerLayout.getLayoutParams();
                            layoutParams.flags = 1024;
                            layoutParams.softInputMode = 20;
                            if (photoViewerLayout.isAttachedToWindow()) {
                                photoViewer.v.updateViewLayout(photoViewerLayout, layoutParams);
                            }
                        }
                        cVar.i.postDelayed(new vq3(bVar, 9), 100L);
                    }
                }
            });
            ArrowSendButton arrowSendButton = (ArrowSendButton) inflate.findViewById(R.id.lg_confirm_btn);
            this.d = arrowSendButton;
            EditText editText6 = this.e;
            if (editText6 == null) {
                editText6 = null;
            }
            if (bwt0.K(editText6) && !cVar.l.getSelectionState().a.isEmpty()) {
                z = true;
            }
            bwt0.p0(arrowSendButton, z);
            ArrowSendButton arrowSendButton2 = this.d;
            if (arrowSendButton2 == null) {
                arrowSendButton2 = null;
            }
            bwt0.i0(arrowSendButton2, new g22(24, this, cVar));
            ArrowSendButton arrowSendButton3 = this.d;
            (arrowSendButton3 != null ? arrowSendButton3 : null).setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.n9a0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    c.b bVar = c.b.this;
                    PhotoViewer photoViewer = bVar.b;
                    if (photoViewer == null) {
                        return false;
                    }
                    bVar.j(photoViewer.r);
                    bVar.i();
                    cVar.q.getText().toString();
                    return true;
                }
            });
            cVar.f.b(new f(io.reactivex.rxjava3.internal.functions.a.b));
            ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
            viewTreeObserver.removeOnGlobalLayoutListener(this.i);
            ?? r3 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.o9a0
                /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onGlobalLayout() {
                    int i;
                    Rect rect;
                    c.b bVar = c.b.this;
                    if (bVar.h == null) {
                        bVar.h = new Rect();
                    }
                    if (gz80.a(28)) {
                        HashSet hashSet = iah0.a;
                        WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
                        DisplayCutout displayCutout = rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null;
                        if (displayCutout != null) {
                            i = displayCutout.getSafeInsetTop();
                            int u = !iah0.s(cVar.a) ? iah0.u() + i : iah0.v();
                            rect = bVar.h;
                            if (rect == null) {
                                rect.bottom = u;
                                EditText editText7 = bVar.e;
                                if (editText7 == null) {
                                    editText7 = null;
                                }
                                if (bwt0.K(editText7)) {
                                    int i2 = rect.bottom;
                                    EditText editText8 = bVar.e;
                                    if (editText8 == null) {
                                        editText8 = null;
                                    }
                                    rect.bottom = i2 - editText8.getHeight();
                                }
                                View view2 = bVar.g;
                                rect.top = (view2 != null ? view2 : null).getBottom();
                                rect.left = 0;
                                rect.right = iah0.v();
                                return;
                            }
                            return;
                        }
                    }
                    i = 0;
                    if (!iah0.s(cVar.a)) {
                    }
                    rect = bVar.h;
                    if (rect == null) {
                    }
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(r3);
            this.i = r3;
            return inflate;
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final WindowManager.LayoutParams f() {
            RectF rectF = PhotoViewer.U;
            WindowManager.LayoutParams a2 = PhotoViewer.c.a();
            if ((((WindowManager.LayoutParams) c.this.i.getLayoutParams()).flags & 131072) == 0) {
                a2.flags = 1024;
                a2.softInputMode = 20;
            }
            return a2;
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final PhotoGalleryView.b g() {
            c cVar = c.this;
            int i = a.$EnumSwitchMapping$0[cVar.d.ordinal()];
            if (i == 1) {
                return new PhotoGalleryView.b.a(new C1475b(1, cVar, c.class, "multipleSelectionCallback", "multipleSelectionCallback(Ljava/util/List;)V", 0));
            }
            if (i == 2) {
                return new PhotoGalleryView.b.C1474b(new C1476c(1, cVar, c.class, "singleSelectionCallback", "singleSelectionCallback(Lcom/vk/photogallery/dto/GalleryItem;)V", 0));
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            new d(1, cVar, c.class, "singleSelectionCallback", "singleSelectionCallback(Lcom/vk/photogallery/dto/GalleryItem;)V", 0);
            return new PhotoGalleryView.b.c(false);
        }

        @Override // com.vk.photogallery.PhotoGalleryView.a
        public final void h() {
            this.b = null;
            i();
        }

        public final void i() {
            c cVar = c.this;
            EditText editText = cVar.q;
            EditText editText2 = this.e;
            if (editText2 == null) {
                editText2 = null;
            }
            editText.setText(editText2.getText().toString());
            EditText editText3 = cVar.q;
            EditText editText4 = this.e;
            if (editText4 == null) {
                editText4 = null;
            }
            int selectionStart = editText4.getSelectionStart();
            EditText editText5 = this.e;
            editText3.setSelection(selectionStart, (editText5 != null ? editText5 : null).getSelectionEnd());
            bwt0.p0(cVar.q, cVar.l.getSelectionState().a.size() > 0 || cVar.q.getText().length() > 0);
            bwt0.p0(cVar.r, bwt0.K(cVar.q));
        }

        public final List<q4t> j(int i) {
            PhotoGalleryView photoGalleryView = c.this.l;
            if (photoGalleryView.getSelectionState().a.size() > 0) {
                return photoGalleryView.getSelectionState().a();
            }
            q4t q4tVar = (q4t) j5g.b0(i, photoGalleryView.getState().c().a);
            return q4tVar == null ? EmptyList.b : Collections.singletonList(q4tVar);
        }
    }

    public c(ContextThemeWrapper contextThemeWrapper, a7u0 a7u0Var, List list, GallerySelectionStrategy gallerySelectionStrategy) {
        this.a = contextThemeWrapper;
        this.b = a7u0Var;
        this.c = list;
        this.d = gallerySelectionStrategy;
        this.e = (WindowManager) contextThemeWrapper.getSystemService("window");
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.f = bVar;
        LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
        this.g = from;
        CoordinatorLayoutWithContextMenuDelegate coordinatorLayoutWithContextMenuDelegate = (CoordinatorLayoutWithContextMenuDelegate) from.inflate(R.layout.lg_viewer_layout, (ViewGroup) null);
        this.i = coordinatorLayoutWithContextMenuDelegate;
        PhotoGalleryView photoGalleryView = (PhotoGalleryView) coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_gallery_view);
        this.l = photoGalleryView;
        photoGalleryView.setGalleryProviders(list);
        photoGalleryView.setBottomPadding(iah0.a(48));
        boolean z = false;
        photoGalleryView.setIsMultiSelectEnabled(gallerySelectionStrategy == GallerySelectionStrategy.MULTIPLE);
        this.k = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_popup_anchor);
        VKTabLayout vKTabLayout = (VKTabLayout) coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_tab_layout);
        this.j = vKTabLayout;
        vKTabLayout.setCustomTabView(R.layout.lg_header_tab_view);
        vKTabLayout.setupWithViewPager(photoGalleryView.getViewPager());
        View findViewById = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_header_container);
        this.n = findViewById;
        View findViewById2 = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_dim);
        this.s = findViewById2;
        View findViewById3 = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_close_btn);
        this.v = findViewById3;
        View findViewById4 = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_bottom_scrim);
        this.m = findViewById4;
        findViewById4.setBackground(new ColorDrawable(e3m.f(R.attr.vk_legacy_background_page, contextThemeWrapper)));
        this.o = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_caption_container);
        ImageView imageView = (ImageView) coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_caption_icon);
        this.r = imageView;
        imageView.setImageDrawable(null);
        this.p = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_caption_separator);
        EditText editText = (EditText) coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_caption_view);
        this.q = editText;
        editText.setText("");
        editText.setSelection(0);
        bwt0.p0(editText, false);
        bwt0.p0(imageView, bwt0.K(editText));
        BottomConfirmButton bottomConfirmButton = (BottomConfirmButton) coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_confirm_btn);
        this.w = bottomConfirmButton;
        ArrowSendButton arrowSendButton = (ArrowSendButton) coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.send_btn);
        this.x = arrowSendButton;
        bwt0.p0(arrowSendButton, bwt0.K(editText) && !photoGalleryView.getSelectionState().a.isEmpty());
        TextView textView = bottomConfirmButton.e;
        if (!bwt0.K(textView)) {
            textView.setVisibility(0);
        }
        View findViewById5 = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_partial_permission);
        this.t = findViewById5;
        View findViewById6 = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.part_media_permission_warning_button);
        this.u = findViewById6;
        if (gz80.a(34)) {
            PermissionHelper.a.getClass();
            z = !tvo.a(contextThemeWrapper, (String[]) Arrays.copyOf(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 1));
        }
        bwt0.p0(findViewById5, z);
        View findViewById7 = coordinatorLayoutWithContextMenuDelegate.findViewById(R.id.lg_bottom_sheet_container);
        this.y = findViewById7;
        BottomSheetBehavior<View> L = BottomSheetBehavior.L(findViewById7);
        this.z = L;
        L.W((((int) (contextThemeWrapper.getResources().getDisplayMetrics().density * (contextThemeWrapper.getResources().getConfiguration().screenHeightDp + 56))) * 2) / 3, false);
        L.V(true);
        L.X(5);
        coordinatorLayoutWithContextMenuDelegate.setOnApplyWindowInsetsListener(new s4p0(new bq00(this, 22), 1));
        coordinatorLayoutWithContextMenuDelegate.addOnAttachStateChangeListener(new com.vk.photogallery.b());
        coordinatorLayoutWithContextMenuDelegate.setContextMenuCreator(new qnj(contextThemeWrapper));
        coordinatorLayoutWithContextMenuDelegate.requestFocus();
        bVar.b(new f(io.reactivex.rxjava3.internal.functions.a.b));
        awt0.h(coordinatorLayoutWithContextMenuDelegate, new g880(this, 5), false);
        findViewById2.setOnClickListener(new t01(this, 6));
        findViewById.setOnClickListener(new o44(0));
        findViewById5.setOnClickListener(new o44(0));
        findViewById6.setOnClickListener(new u01(this, 10));
        vKTabLayout.f(new t9a0(this));
        s1x s1xVar = new s1x(this, 21);
        editText.setOnClickListener(new a06(s1xVar, 8));
        editText.setOnFocusChangeListener(new l9a0(s1xVar, 0));
        awt0.h(editText, new ubw(this, 22), false);
        r9a0 r9a0Var = new r9a0(this);
        ArrayList<BottomSheetBehavior.d> arrayList = L.Z;
        arrayList.clear();
        arrayList.add(r9a0Var);
        bwt0.i0(findViewById3, new lw20(this, 14));
        bottomConfirmButton.setListener(new s9a0(this));
        arrowSendButton.setOnClickListener(new xz5(this, 8));
        arrowSendButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.k9a0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                com.vk.photogallery.c cVar = com.vk.photogallery.c.this;
                cVar.l.getSelectionState().a();
                cVar.q.getText().toString();
                return true;
            }
        });
        photoGalleryView.setCallback(new b());
        PermissionHelper.a.getClass();
        hg1.b(coordinatorLayoutWithContextMenuDelegate, PermissionHelper.r(PermissionHelper.e).subscribe(new p350(new l6u(this, 28), 6)));
    }

    public static final void a(c cVar, String str) {
        View view;
        TextView textView;
        TabLayout.g b2 = cVar.j.b(cVar.l.getViewPager().getCurrentItem());
        if (b2 == null || (view = b2.f) == null || (textView = (TextView) view.findViewById(android.R.id.text1)) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void b() {
        this.f.dispose();
        VkContextMenu vkContextMenu = this.h;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.h = null;
        this.z.X(5);
    }

    public final void c() {
        boolean z;
        VkContextMenu vkContextMenu = this.h;
        if (vkContextMenu != null && vkContextMenu.c()) {
            VkContextMenu vkContextMenu2 = this.h;
            if (vkContextMenu2 != null) {
                vkContextMenu2.b();
            }
            this.h = null;
            return;
        }
        j9a0 j9a0Var = this.l.j.e;
        if (j9a0Var != null) {
            i9a0 i9a0Var = j9a0Var.k;
            z = (i9a0Var != null ? i9a0Var : null).d(true);
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        this.q.getText();
        b();
    }
}
