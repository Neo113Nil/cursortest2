package com.vk.attachpicker.fragment.gallery;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.attachpicker.b;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.VkButton;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.sdk.SharedKt;
import xsna.a5t;
import xsna.ab0;
import xsna.af50;
import xsna.aj50;
import xsna.b470;
import xsna.bcc0;
import xsna.bek0;
import xsna.bwt0;
import xsna.ccc0;
import xsna.d24;
import xsna.dcc0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.ebs;
import xsna.em6;
import xsna.eqy;
import xsna.ey90;
import xsna.fr20;
import xsna.fy90;
import xsna.gz10;
import xsna.gz80;
import xsna.h090;
import xsna.h90;
import xsna.hb0;
import xsna.hg1;
import xsna.iah0;
import xsna.ihs;
import xsna.ik90;
import xsna.itg0;
import xsna.j34;
import xsna.j5t;
import xsna.jbc0;
import xsna.jk90;
import xsna.kn4;
import xsna.ky6;
import xsna.l1i;
import xsna.lo10;
import xsna.mh40;
import xsna.msy;
import xsna.nha0;
import xsna.nht;
import xsna.pdw;
import xsna.pxo0;
import xsna.qg90;
import xsna.r8a0;
import xsna.rfu;
import xsna.rkz;
import xsna.s8g0;
import xsna.skz;
import xsna.sp;
import xsna.tuz;
import xsna.tvo;
import xsna.u9;
import xsna.ua0;
import xsna.uer0;
import xsna.v100;
import xsna.vua0;
import xsna.wf40;
import xsna.x2t;
import xsna.ya0;
import xsna.yj3;
import xsna.yx90;

/* compiled from: PostingAttachGalleryFragment.kt */
/* loaded from: classes15.dex */
public final class PostingAttachGalleryFragment extends BaseFragment implements View.OnClickListener, p.c, tvo.a, nht, h90.a {
    public static final /* synthetic */ int p0 = 0;
    public final pxo0 S = new pxo0(1000);
    public d24 T;
    public com.vk.attachpicker.fragment.gallery.a U;
    public AppCompatSpinner V;
    public TextView W;
    public View X;
    public View Y;
    public FrameLayout Z;
    public ViewGroup a0;
    public VkButton b0;
    public rfu c0;
    public a d0;
    public com.vk.core.simplescreen.a e0;
    public p f0;
    public RecyclerPaginatedView g0;
    public final Object h0;
    public final boolean i0;
    public hb0<nha0> j0;
    public dcc0 k0;
    public int l0;
    public int m0;
    public final Object n0;
    public final d o0;

    /* compiled from: PostingAttachGalleryFragment.kt */
    public final class a extends yj3<gz10> {
        public a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // xsna.yj3
        public final boolean k(int i) {
            return i < PostingAttachGalleryFragment.this.k0.c.a;
        }

        @Override // xsna.yj3
        public final void m(gz10 gz10Var) {
            int K0;
            dcc0 dcc0Var;
            gz10 gz10Var2 = gz10Var;
            PostingAttachGalleryFragment postingAttachGalleryFragment = PostingAttachGalleryFragment.this;
            com.vk.attachpicker.fragment.gallery.a aVar = postingAttachGalleryFragment.U;
            if (aVar == null || (K0 = aVar.K0(gz10Var2.getBindingAdapterPosition())) == -1 || (dcc0Var = postingAttachGalleryFragment.k0) == null) {
                return;
            }
            dcc0Var.f(K0);
        }

        @Override // xsna.yj3
        public final void s(int i, gz10 gz10Var) {
            y(i);
        }

        @Override // xsna.yj3
        public final void v(int i, gz10 gz10Var) {
            y(i);
        }

        public final void y(int i) {
            PostingAttachGalleryFragment postingAttachGalleryFragment;
            com.vk.attachpicker.fragment.gallery.a aVar;
            dcc0 dcc0Var;
            com.vk.attachpicker.c cVar;
            if (i == -1 || (aVar = (postingAttachGalleryFragment = PostingAttachGalleryFragment.this).U) == null) {
                return;
            }
            Object c = aVar.c.c(i);
            MediaStoreEntry mediaStoreEntry = c instanceof MediaStoreEntry ? (MediaStoreEntry) c : null;
            if (mediaStoreEntry == null || (dcc0Var = postingAttachGalleryFragment.k0) == null || (cVar = dcc0Var.c) == null) {
                return;
            }
            int K0 = aVar.K0(i);
            if (cVar.q(mediaStoreEntry)) {
                cVar.c(mediaStoreEntry);
            } else {
                cVar.f(K0, null, mediaStoreEntry);
            }
        }
    }

    /* compiled from: PostingAttachGalleryFragment.kt */
    public static final class b<O> implements ua0 {
        public final /* synthetic */ b470 b;
        public final /* synthetic */ PostingAttachGalleryFragment c;

        public b(b470 b470Var, PostingAttachGalleryFragment postingAttachGalleryFragment) {
            this.b = b470Var;
            this.c = postingAttachGalleryFragment;
        }

        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            if (obj != null) {
                b470 b470Var = this.b;
                b470Var.a(obj);
                PostingAttachGalleryFragment postingAttachGalleryFragment = this.c;
                ((j34) postingAttachGalleryFragment.getActivity()).V2(b470Var.b(postingAttachGalleryFragment.requireContext()));
            }
        }
    }

    /* compiled from: PostingAttachGalleryFragment.kt */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            com.vk.attachpicker.fragment.gallery.a aVar = PostingAttachGalleryFragment.this.U;
            Object c = aVar != null ? aVar.c.c(i) : null;
            return ((c instanceof x2t) || (c instanceof jk90)) ? 3 : 1;
        }
    }

    public PostingAttachGalleryFragment() {
        v100 v100Var = new v100(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h0 = msy.a(lazyThreadSafetyMode, v100Var);
        this.i0 = gz80.a(33);
        this.l0 = 10;
        this.n0 = msy.a(lazyThreadSafetyMode, new fr20(this, 18));
        this.o0 = new d();
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void Bi(p pVar, MediaStoreEntry mediaStoreEntry) {
        pVar.S(mediaStoreEntry);
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            dcc0Var.K0(i, strArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void V2(Intent intent) {
        ?? r0 = this.n0;
        ((a5t) r0.getValue()).b();
        ((a5t) r0.getValue()).a(intent);
        ((j34) getActivity()).V2(intent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.attachpicker.c cVar;
        com.vk.attachpicker.c cVar2;
        ((a5t) this.n0.getValue()).c(this);
        dcc0 dcc0Var = this.k0;
        if (((dcc0Var == null || (cVar2 = dcc0Var.c) == null) ? 0 : cVar2.e.size()) <= 0) {
            return false;
        }
        dcc0 dcc0Var2 = this.k0;
        if (dcc0Var2 == null || (cVar = dcc0Var2.c) == null) {
            return true;
        }
        cVar.clear();
        return true;
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void ig(com.vk.attachpicker.screen.a aVar, MediaStoreEntry mediaStoreEntry) {
        aVar.J(mediaStoreEntry);
    }

    public final void io(boolean z) {
        AppCompatSpinner appCompatSpinner = this.V;
        if (appCompatSpinner != null) {
            appCompatSpinner.setEnabled(z);
        }
    }

    public final void jo(boolean z) {
        View view = this.Y;
        if (view != null) {
            bwt0.p0(view, z);
        }
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final a.c k9(int i) {
        int K0;
        RecyclerView recyclerView;
        com.vk.attachpicker.fragment.gallery.a aVar = this.U;
        if (aVar == null || (K0 = aVar.K0(i)) == -1) {
            return null;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.g0;
        RecyclerView.e0 findViewHolderForAdapterPosition = (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) ? null : recyclerView.findViewHolderForAdapterPosition(K0);
        gz10 gz10Var = findViewHolderForAdapterPosition instanceof gz10 ? (gz10) findViewHolderForAdapterPosition : null;
        if (gz10Var == null) {
            return null;
        }
        MediaStoreItemSmallView mediaStoreItemSmallView = gz10Var.o;
        a.c cVar = new a.c();
        cVar.a = mediaStoreItemSmallView;
        cVar.b = mediaStoreItemSmallView;
        cVar.c = this.g0;
        cVar.d = mediaStoreItemSmallView.getStoreEntry();
        if (mediaStoreItemSmallView.c0()) {
            cVar.e = mediaStoreItemSmallView.getImageWidth();
            cVar.f = mediaStoreItemSmallView.getImageHeight();
        }
        return cVar;
    }

    public final void ko(List<? extends Object> list, boolean z) {
        boolean z2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        com.vk.attachpicker.fragment.gallery.a aVar = this.U;
        if (aVar == null || aVar.g != z || this.c0 == null) {
            if (this.c0 != null) {
                RecyclerPaginatedView recyclerPaginatedView = this.g0;
                if (recyclerPaginatedView != null && (recyclerView2 = recyclerPaginatedView.getRecyclerView()) != null) {
                    recyclerView2.removeItemDecoration(this.c0);
                }
                this.c0 = null;
            }
            List<? extends Object> list2 = list;
            int i = 1;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof jk90) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z && z2) {
                i = 2;
            } else if (!z && !z2) {
                i = 0;
            }
            this.c0 = new rfu(iah0.a(4), 3, i);
            RecyclerPaginatedView recyclerPaginatedView2 = this.g0;
            if (recyclerPaginatedView2 != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null) {
                recyclerView.addItemDecoration(this.c0);
            }
        }
        com.vk.attachpicker.fragment.gallery.a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.g = z;
        }
        if (aVar2 != null) {
            aVar2.setItems(list);
        }
    }

    public final void lo(boolean z) {
        RecyclerPaginatedView recyclerPaginatedView = this.g0;
        if (recyclerPaginatedView != null) {
            bwt0.p0(recyclerPaginatedView, z);
        }
    }

    public final void mo(int i) {
        AppCompatSpinner appCompatSpinner = this.V;
        if (appCompatSpinner != null) {
            appCompatSpinner.setSelection(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void no(boolean z) {
        PackageManager packageManager;
        if (z) {
            startActivityForResult(new Intent(getActivity(), (Class<?>) this.h0.getValue()).putExtra("type", 0), 10);
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        FragmentActivity activity = getActivity();
        if (activity == null || (packageManager = activity.getPackageManager()) == null || intent.resolveActivity(packageManager) == null) {
            return;
        }
        qg90 i = vua0.i(true);
        intent.putExtra("output", com.vk.core.files.a.N((File) i.b));
        Integer num = (Integer) i.a;
        if (num != null) {
            startActivityForResult(intent, num.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            ?? r1 = dcc0Var.p;
            PostingAttachGalleryFragment postingAttachGalleryFragment = dcc0Var.b;
            s8g0 s8g0Var = dcc0Var.e;
            if (s8g0Var != null) {
                s8g0Var.onActivityResult(i, i2, intent);
            }
            if (i2 == -1) {
                Intent intent2 = null;
                if (vua0.s(i)) {
                    boolean t = vua0.t(i);
                    File l = vua0.l(i);
                    if (l != null) {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        itg0.n(com.vk.core.files.b.c(new com.vk.core.files.b(context.getApplicationContext()), l, null, 6));
                    }
                    if (t) {
                        Uri fromFile = Uri.fromFile(l);
                        Intent a2 = b.a.a(fromFile, true, false);
                        a2.setData(fromFile);
                        postingAttachGalleryFragment.V2(a2);
                        dcc0Var.e().c();
                        jbc0 jbc0Var = (jbc0) r1.getValue();
                        if (jbc0Var != null) {
                            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                            jbc0Var.g();
                        }
                    }
                }
                if (intent != null) {
                    if (i != 10) {
                        if (i == 11) {
                            intent2 = new Intent().putExtra("photoVk", (PhotoAttachment) intent.getParcelableExtra(SharedKt.PARAM_ATTACHMENT));
                        } else if (i != 10666) {
                            intent2 = intent;
                        }
                    } else if (intent.hasExtra(X3.i.b)) {
                        dcc0Var.e().d();
                        jbc0 jbc0Var2 = (jbc0) r1.getValue();
                        if (jbc0Var2 != null) {
                            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType2 = SchemeStat$PostDraftItemEventType.POST_NOW;
                            jbc0Var2.g();
                        }
                        intent2 = new Intent().putExtra("photoDevice", intent.getStringExtra(X3.i.b));
                    }
                    if (intent2 != null) {
                        postingAttachGalleryFragment.V2(intent2);
                    }
                }
            }
        }
        p pVar = this.f0;
        if (pVar != null) {
            pVar.f(i, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.S.a()) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == R.id.attach_gallery_take_photo) || (valueOf != null && valueOf.intValue() == R.id.picker_attach_gallery_photo_view)) {
            dcc0 dcc0Var = this.k0;
            if (dcc0Var != null) {
                dcc0Var.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.picker_attach_gallery_video_view) {
            dcc0 dcc0Var2 = this.k0;
            if (dcc0Var2 != null) {
                dcc0Var2.c();
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.attach_gallery_counter_view) {
            if (valueOf != null && valueOf.intValue() == R.id.attach_gallery_close_button) {
                ((a5t) this.n0.getValue()).c(this);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            return;
        }
        dcc0 dcc0Var3 = this.k0;
        if (dcc0Var3 != null) {
            PostingAttachGalleryFragment postingAttachGalleryFragment = dcc0Var3.b;
            com.vk.attachpicker.c cVar = dcc0Var3.c;
            if (cVar.e.size() == 0) {
                return;
            }
            Intent w = cVar.w();
            cVar.clear();
            com.vk.attachpicker.fragment.gallery.a aVar = postingAttachGalleryFragment.U;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
            postingAttachGalleryFragment.V2(w);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.T = new d24();
        dcc0 dcc0Var = new dcc0(this);
        this.k0 = dcc0Var;
        this.U = new com.vk.attachpicker.fragment.gallery.a(dcc0Var.c, dcc0Var);
        Bundle arguments = getArguments();
        this.m0 = arguments != null ? arguments.getInt("currAtt", this.m0) : this.m0;
        Bundle arguments2 = getArguments();
        this.l0 = arguments2 != null ? arguments2.getInt("maxAtt", this.l0) : this.l0;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        if (com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_NO_PERMISSION_PHOTO_PICKER) || this.i0) {
            b470 b470Var = new b470(0);
            int i = this.l0 - this.m0;
            this.j0 = registerForActivityResult(i == 1 ? new ab0() : new ya0(i), new b(b470Var, this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_attach_gallery, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.vk.attachpicker.c cVar;
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.g0;
        int computeVerticalScrollOffset = (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) ? 0 : recyclerView.computeVerticalScrollOffset();
        if (j5t.c != computeVerticalScrollOffset) {
            j5t.c = computeVerticalScrollOffset;
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putInt("posting_gallery_scroll", computeVerticalScrollOffset);
            aVar.a();
        }
        this.W = null;
        this.b0 = null;
        this.Z = null;
        this.Y = null;
        this.X = null;
        this.g0 = null;
        this.f0 = null;
        this.V = null;
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null && (cVar = dcc0Var.c) != null) {
            cVar.d = null;
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        em6 currentScreen;
        super.onPause();
        com.vk.core.simplescreen.a aVar = this.e0;
        if (aVar == null || (currentScreen = aVar.b.getCurrentScreen()) == null) {
            return;
        }
        currentScreen.i();
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        s8g0 s8g0Var;
        super.onRequestPermissionsResult(i, strArr, iArr);
        dcc0 dcc0Var = this.k0;
        if (dcc0Var == null || (s8g0Var = dcc0Var.e) == null) {
            return;
        }
        s8g0Var.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        em6 currentScreen;
        FragmentActivity activity;
        super.onResume();
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            s8g0 s8g0Var = dcc0Var.e;
            if (s8g0Var != null) {
                s8g0Var.c(false);
            }
            if (gz80.a(29) && (activity = dcc0Var.b.getActivity()) != null) {
                PermissionHelper permissionHelper = PermissionHelper.a;
                permissionHelper.getClass();
                if (PermissionHelper.b(activity, PermissionHelper.e)) {
                    String[] strArr = PermissionHelper.p;
                    if (!PermissionHelper.b(activity, strArr)) {
                        PermissionHelper.l(permissionHelper, activity, strArr, null, null, 28);
                    }
                }
            }
        }
        com.vk.core.simplescreen.a aVar = this.e0;
        if (aVar == null || (currentScreen = aVar.b.getCurrentScreen()) == null || currentScreen.d) {
            return;
        }
        currentScreen.j();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            Bundle arguments = getArguments();
            PostingAttachGalleryFragment postingAttachGalleryFragment = dcc0Var.b;
            boolean z = arguments != null ? arguments.getBoolean("takePhoto", false) : false;
            if (arguments != null) {
                dcc0Var.f = arguments.getInt("currAtt", dcc0Var.f);
                dcc0Var.g = arguments.getInt("maxAtt", dcc0Var.g);
            }
            c.h hVar = new c.h(new ccc0(dcc0Var));
            hVar.i = dcc0Var.h;
            hVar.l = false;
            hVar.m = false;
            dcc0Var.o = com.vk.lists.f.a(hVar, postingAttachGalleryFragment.g0);
            dcc0Var.d = new ik90(dcc0Var.l, postingAttachGalleryFragment.requireContext(), new l1i(dcc0Var, 29));
            ebs c2 = kn4.c(postingAttachGalleryFragment);
            FrameLayout frameLayout = postingAttachGalleryFragment.Z;
            dhr0.a.getClass();
            Context E = dhr0.E();
            ey90 ey90Var = new ey90(e3m.f(R.attr.vk_ui_background_content, E), e3m.f(R.attr.vk_ui_text_subhead, E));
            String[] strArr = PermissionHelper.g;
            PermissionHelper.a.getClass();
            dcc0Var.e = new s8g0(c2, frameLayout, ey90Var, new yx90(R.string.vk_permissions_storage, 16, strArr, PermissionHelper.q, true), new wf40(dcc0Var, 14), null, null, null, new h090(b470.c, new lo10(dcc0Var, 19)), null);
            com.vk.attachpicker.c cVar = dcc0Var.c;
            cVar.a = dcc0Var.g;
            cVar.c = new bcc0(dcc0Var);
            if (z) {
                dcc0Var.d();
            }
        }
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        if (com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_NO_PERMISSION_PHOTO_PICKER)) {
            dcc0 dcc0Var2 = this.k0;
            hb0<nha0> hb0Var = this.j0;
            if (dcc0Var2 == null || hb0Var == null) {
                return;
            }
            dcc0Var2.r = hb0Var;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            dcc0Var.d = null;
            dcc0Var.e = null;
        }
        super.onStop();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.vk.attachpicker.c cVar;
        super.onViewCreated(view, bundle);
        this.W = (TextView) view.findViewById(R.id.attach_gallery_title_text);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) view.findViewById(R.id.attach_gallery_album_spinner);
        if (appCompatSpinner != null) {
            appCompatSpinner.setAdapter((SpinnerAdapter) this.T);
            appCompatSpinner.setOnItemSelectedListener(this.o0);
        } else {
            appCompatSpinner = null;
        }
        this.V = appCompatSpinner;
        View findViewById = view.findViewById(R.id.attach_gallery_take_photo);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        View findViewById2 = view.findViewById(R.id.attach_gallery_close_button);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        View findViewById3 = view.findViewById(R.id.picker_attach_gallery_photo_view);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View findViewById4 = view.findViewById(R.id.picker_attach_gallery_video_view);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this);
        }
        this.X = view.findViewById(R.id.attach_gallery_progress_view);
        this.Y = view.findViewById(R.id.attach_gallery_no_images_layout);
        this.Z = (FrameLayout) view.findViewById(R.id.attach_gallery_permission_layout);
        this.a0 = (ViewGroup) view.findViewById(R.id.attach_counter_view_wrapper);
        VkButton vkButton = (VkButton) view.findViewById(R.id.attach_gallery_counter_view);
        if (vkButton != null) {
            vkButton.setOnClickListener(this);
        } else {
            vkButton = null;
        }
        this.b0 = vkButton;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.attach_gallery_recycler_view);
        recyclerPaginatedView.setAdapter(this.U);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
        dVar.c(3);
        dVar.e = new c();
        dVar.a();
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        a aVar = new a(recyclerView);
        this.d0 = aVar;
        recyclerView.addOnItemTouchListener(aVar);
        this.g0 = recyclerPaginatedView;
        recyclerPaginatedView.setLoaderVisibilityChangeListener(new tuz(this, 8));
        boolean z = this.i0;
        if (z) {
            FrameLayout frameLayout = (FrameLayout) bwt0.p(view, R.id.fl_samsung_photopicker_stub_view, null, null, 6);
            fy90 fy90Var = new fy90(requireContext());
            bwt0.p0(fy90Var.findViewById(R.id.tv_icon), true);
            TextView textView = (TextView) bwt0.p(fy90Var, R.id.tv_message, null, null, 6);
            textView.setText(textView.getResources().getString(R.string.failed_permission_migration_message));
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
            bwt0.p0(textView, true);
            ((TextView) bwt0.p(fy90Var, R.id.tv_grant_permissions, null, null, 6)).setVisibility(8);
            TextView textView2 = (TextView) bwt0.p(fy90Var, R.id.tv_other_permission, null, null, 6);
            textView2.setVisibility(0);
            textView2.setText(R.string.vk_permissions_no_permissions_open_gallery);
            bwt0.i0(textView2, new af50(this, 14));
            frameLayout.addView(fy90Var);
            PermissionHelper.a.getClass();
            hg1.a(PermissionHelper.r(PermissionHelper.e).subscribe(new skz(new r8a0(frameLayout, 5), 17)), getViewLifecycleOwner());
            getViewLifecycleOwner().getLifecycle().addObserver(new uer0(ihs.b.subscribe(new pdw(new u9(25, frameLayout, this), 17))));
        }
        sp.u(view, dhr0.L());
        mh40 mh40Var = new mh40(this, 9);
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null && (cVar = dcc0Var.c) != null) {
            cVar.d = mh40Var;
        }
        if (z) {
            getViewLifecycleOwner().getLifecycle().addObserver(new uer0(ihs.b.subscribe(new rkz(new aj50(this, 9), 18))));
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            dcc0Var.pc(i, list);
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        dcc0 dcc0Var = this.k0;
        if (dcc0Var != null) {
            dcc0Var.wi(i, list);
        }
    }

    @Override // com.vk.attachpicker.screen.p.c
    public final void zc(int i, int i2) {
        View view;
        View view2;
        if (i == -1) {
            return;
        }
        a.c k9 = k9(i);
        if (k9 != null && (view2 = k9.b) != null) {
            view2.setVisibility(0);
        }
        a.c k92 = k9(i2);
        if (k92 == null || (view = k92.b) == null) {
            return;
        }
        view.setVisibility(4);
    }

    /* compiled from: PostingAttachGalleryFragment.kt */
    public static final class d implements AdapterView.OnItemSelectedListener {
        public boolean b = true;

        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            RecyclerView recyclerView;
            PostingAttachGalleryFragment postingAttachGalleryFragment = PostingAttachGalleryFragment.this;
            dcc0 dcc0Var = postingAttachGalleryFragment.k0;
            if (dcc0Var != null) {
                d24 d24Var = postingAttachGalleryFragment.T;
                dcc0Var.h((AlbumEntry) (d24Var != null ? d24Var.b.get(i) : null), i, !this.b);
            }
            RecyclerPaginatedView recyclerPaginatedView = postingAttachGalleryFragment.g0;
            if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                if (this.b) {
                    if (j5t.c < 0) {
                        j5t.c = Preference.j().getInt("posting_gallery_scroll", 0);
                    }
                    recyclerView.scrollBy(0, j5t.c);
                } else {
                    recyclerView.scrollToPosition(0);
                }
            }
            this.b = false;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @Override // com.vk.attachpicker.screen.a.b
    public final void N7(MediaStoreEntry mediaStoreEntry) {
    }
}
