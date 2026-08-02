package com.vk.photos.legacy;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.data.PaginatedList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.photos.legacy.EditAlbumFragment;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragment;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a920;
import xsna.asu0;
import xsna.bwt0;
import xsna.cvk;
import xsna.dhr0;
import xsna.dnz;
import xsna.dz5;
import xsna.ev6;
import xsna.f5h0;
import xsna.fgz;
import xsna.fl30;
import xsna.fsk;
import xsna.gk;
import xsna.gqq;
import xsna.iah0;
import xsna.ifa0;
import xsna.j34;
import xsna.j6r0;
import xsna.jx2;
import xsna.myc0;
import xsna.n8g;
import xsna.o25;
import xsna.ob9;
import xsna.oz50;
import xsna.p0e0;
import xsna.qi00;
import xsna.rwi;
import xsna.sw50;
import xsna.t2i0;
import xsna.u1u0;
import xsna.vea0;
import xsna.vif0;
import xsna.xg5;
import xsna.xwk;
import xsna.ysg0;
import xsna.zea0;

/* loaded from: classes16.dex */
public class PhotoListFragment extends VKRecyclerFragment<Photo> {
    public static final /* synthetic */ int S0 = 0;
    public PhotoAlbum I0;
    public a920 J0;
    public final ArrayList<m> K0;
    public int L0;
    public boolean M0;
    public ImageViewer.c<Photo> N0;
    public boolean O0;
    public String P0;
    public String Q0;
    public final io.reactivex.rxjava3.disposables.b R0;

    /* renamed from: com.vk.photos.legacy.PhotoListFragment$4, reason: invalid class name */
    public class AnonymousClass4 implements ViewTreeObserver.OnPreDrawListener {
        public boolean b = true;
        public AnimatorSet c = null;
        public int d = 255;
        public UsableRecyclerView e;

        /* renamed from: com.vk.photos.legacy.PhotoListFragment$4$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                AnonymousClass4.this.c = null;
            }
        }

        public AnonymousClass4() {
        }

        @Keep
        public int getToolbarTitleTextAlpha() {
            return this.d;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            boolean z;
            float f;
            UsableRecyclerView usableRecyclerView = this.e;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            if (usableRecyclerView == null) {
                int i = PhotoListFragment.S0;
                this.e = photoListFragment.n0;
            }
            int i2 = PhotoListFragment.S0;
            UsableRecyclerView usableRecyclerView2 = photoListFragment.n0;
            if (usableRecyclerView2 == null) {
                this.e.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            if (usableRecyclerView2.getChildCount() > 0) {
                if (photoListFragment.n0.getChildCount() > 0) {
                    UsableRecyclerView usableRecyclerView3 = photoListFragment.n0;
                    if (usableRecyclerView3.getChildAdapterPosition(usableRecyclerView3.getChildAt(0)) == 0) {
                        int top = photoListFragment.n0.getChildAt(0).getTop();
                        WeakHashMap weakHashMap = j6r0.a;
                        if (top > iah0.a(-50.0f)) {
                            z = false;
                            if (z != this.b) {
                                this.b = z;
                                AnimatorSet animatorSet = this.c;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    this.c = null;
                                }
                                AnimatorSet animatorSet2 = new AnimatorSet();
                                ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "toolbarTitleTextAlpha", this.b ? 255 : 0);
                                Toolbar toolbar = photoListFragment.Q;
                                if (this.b) {
                                    WeakHashMap weakHashMap2 = j6r0.a;
                                    f = iah0.a(3.0f);
                                } else {
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                                animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(toolbar, "elevation", f));
                                animatorSet2.setDuration(200L);
                                animatorSet2.addListener(new a());
                                this.c = animatorSet2;
                                animatorSet2.start();
                            }
                        }
                    }
                }
                z = true;
                if (z != this.b) {
                }
            }
            return true;
        }

        @Keep
        public void setToolbarTitleTextAlpha(int i) {
            Toolbar toolbar = PhotoListFragment.this.Q;
            if (toolbar != null) {
                toolbar.setTitleTextColor(n8g.l(-1, i));
            }
            this.d = i;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = PhotoListFragment.S0;
            PhotoListFragment.this.n0.scrollToPosition(0);
        }
    }

    public class b extends RecyclerView.n {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.Jo(photoListFragment.J0.L0(childAdapterPosition), photoListFragment.J0.N0(childAdapterPosition), childAdapterPosition, rect);
        }
    }

    public class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i7 - i5;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.L0 = i9;
            if (i9 != i10) {
                photoListFragment.Ko();
                photoListFragment.J0.notifyDataSetChanged();
            }
        }
    }

    public class d extends GridLayoutManager.c {
        public d() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            int N0;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            RecyclerView.Adapter L0 = photoListFragment.J0.L0(i);
            if ((L0 instanceof l) && photoListFragment.K0.size() > (N0 = photoListFragment.J0.N0(i) + ((l) L0).c)) {
                return photoListFragment.K0.get(N0).a;
            }
            return 1000;
        }
    }

    public class e extends fgz<Photo> {
        public e(PhotoListFragment photoListFragment) {
            super(photoListFragment);
        }

        @Override // xsna.fgz, xsna.hx2
        /* renamed from: r */
        public final void b(VKList<Photo> vKList) {
            super.b(vKList);
            PhotoListFragment.this.I0.f = vKList.i();
        }
    }

    public class f extends fgz<Photo> {
        public f(PhotoListFragment photoListFragment) {
            super(photoListFragment);
        }

        @Override // xsna.rpj0, xsna.q76, xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            super.e(vKApiExecutionException);
            PhotoListFragment.this.Q0 = null;
        }

        @Override // xsna.fgz, xsna.hx2
        /* renamed from: r */
        public final void b(VKList<Photo> vKList) {
            super.b(vKList);
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            photoListFragment.I0.f = vKList.i();
            photoListFragment.P0 = vKList.j();
            photoListFragment.Q0 = null;
        }
    }

    public class g extends fgz<Photo> {
        public g(PhotoListFragment photoListFragment) {
            super(photoListFragment);
        }

        @Override // xsna.fgz, xsna.hx2
        /* renamed from: r */
        public final void b(VKList<Photo> vKList) {
            super.b(vKList);
            PhotoListFragment.this.I0.f = vKList.i();
        }
    }

    public static class h extends oz50 {
        public h(PhotoAlbum photoAlbum) {
            super(PhotoListFragment.class, null, null);
            this.j.putParcelable("album", photoAlbum);
        }
    }

    public class i extends UsableRecyclerView.c<j> {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            j jVar = (j) e0Var;
            TextView textView = jVar.m;
            TextView textView2 = jVar.l;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            textView2.setText(photoListFragment.I0.g);
            if (TextUtils.isEmpty(photoListFragment.I0.h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(xwk.d().a().m(photoListFragment.I0.h));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return PhotoListFragment.this.new j();
        }
    }

    public class j extends UsableRecyclerView.x {
        public final TextView l;
        public final TextView m;

        public j() {
            super(View.inflate(PhotoListFragment.this.getActivity(), R.layout.photo_album_header, null));
            this.l = (TextView) this.itemView.findViewById(R.id.title);
            this.m = (TextView) this.itemView.findViewById(R.id.description);
        }
    }

    public class k extends ob9 {
        public k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        @Nullable
        public View c(int i) {
            int i2 = PhotoListFragment.S0;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            if (photoListFragment.n0 == null) {
                return null;
            }
            for (int i3 = 0; i3 < photoListFragment.n0.getChildCount(); i3++) {
                View childAt = photoListFragment.n0.getChildAt(i3);
                RecyclerView.e0 childViewHolder = photoListFragment.n0.getChildViewHolder(childAt);
                if (childViewHolder instanceof n) {
                    if (photoListFragment.v0.indexOf((Photo) ((n) childViewHolder).m) == i) {
                        return childAt;
                    }
                }
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        @NonNull
        public final Integer f() {
            return Integer.valueOf(PhotoListFragment.this.I0.f);
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        @Nullable
        public final Rect g() {
            int i = PhotoListFragment.S0;
            UsableRecyclerView usableRecyclerView = PhotoListFragment.this.n0;
            if (usableRecyclerView != null) {
                return bwt0.F(usableRecyclerView);
            }
            return null;
        }

        @Override // xsna.ob9
        public final boolean k(@NonNull Photo photo) {
            UserId userId = photo.e;
            PhotoAlbum photoAlbum = PhotoListFragment.this.I0;
            return userId == photoAlbum.c && photo.d == photoAlbum.b;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void o() {
            int i = PhotoListFragment.S0;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            if (photoListFragment.u0.e) {
                photoListFragment.N0();
            }
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            PhotoListFragment.this.N0 = null;
        }
    }

    public class l extends UsableRecyclerView.c<n> {
        public final int c;
        public final int d;

        public l(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            Photo photo;
            int i3 = this.c + i;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            if (i3 >= 0) {
                int i4 = PhotoListFragment.S0;
                if (i3 < photoListFragment.v0.size()) {
                    photo = (Photo) photoListFragment.v0.get(i3);
                    m mVar = (i3 >= 0 || i3 >= photoListFragment.K0.size()) ? null : photoListFragment.K0.get(i3);
                    if (photo == null && mVar != null) {
                        return photo.Db(Math.min(320, mVar.b), false).d.d;
                    }
                }
            }
            photo = null;
            if (i3 >= 0) {
            }
            return photo == null ? null : null;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = PhotoListFragment.S0;
            return Math.min(PhotoListFragment.this.v0.size() - this.c, this.d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            n nVar = (n) e0Var;
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            int size = photoListFragment.K0.size();
            int i2 = this.c;
            if (size > 0) {
                m mVar = photoListFragment.K0.get(i2 + i);
                nVar.itemView.getLayoutParams().height = mVar.b;
                nVar.n = mVar;
            }
            nVar.V5((Photo) photoListFragment.v0.get(i2 + i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            return photoListFragment.new n(photoListFragment.I0);
        }
    }

    public class m {
        public int a;
        public int b;
        public int c;
    }

    public class n extends vif0<Photo> implements UsableRecyclerView.e {
        public m n;
        public final VKImageView o;
        public final PhotoAlbum p;
        public final gk q;
        public final StringBuilder r;

        public n(PhotoAlbum photoAlbum) {
            super(new VKImageView(PhotoListFragment.this.getActivity()));
            this.r = new StringBuilder();
            this.p = photoAlbum;
            this.q = new gk(this.itemView.getContext());
            VKImageView vKImageView = (VKImageView) this.itemView;
            this.o = vKImageView;
            WeakHashMap weakHashMap = j6r0.a;
            vKImageView.setLayoutParams(new RecyclerView.p(-1, iah0.a(180.0f)));
            vKImageView.setActualScaleType(f5h0.f.a);
            vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.selectableItemBackgroundBorderless));
            vKImageView.setContentDescription(g6(R.string.accessibility_photo));
        }

        @Override // xsna.vif0
        public final void i6(Photo photo) {
            Photo photo2 = photo;
            m mVar = this.n;
            if (mVar != null) {
                String str = photo2.Db(Math.min(320, mVar.b), false).d.d;
                VKImageView vKImageView = this.o;
                vKImageView.load(str);
                PhotoListFragment photoListFragment = PhotoListFragment.this;
                vKImageView.setContentDescription(PickVKPhotoFragment.no(photoListFragment.B(), photo2, photoListFragment.M0 ? this.p.g : null, this.r, this.q));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            PhotoListFragment photoListFragment = PhotoListFragment.this;
            if (photoListFragment.N0 != null) {
                return;
            }
            photoListFragment.No((Photo) this.m);
        }
    }

    public PhotoListFragment() {
        super(100);
        this.K0 = new ArrayList<>();
        this.Q0 = null;
        this.R0 = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public void A3(List<Photo> list) {
        ImageViewer.c<Photo> cVar = this.N0;
        if (cVar != null) {
            cVar.c(list);
        }
        Ko();
    }

    @NonNull
    public k Io() {
        return new k();
    }

    public void Jo(RecyclerView.Adapter adapter, int i2, int i3, Rect rect) {
        if (adapter instanceof l) {
            int i4 = i2 + ((l) adapter).c;
            ArrayList<T> arrayList = this.v0;
            if (i4 >= arrayList.size()) {
                return;
            }
            WeakHashMap weakHashMap = j6r0.a;
            rect.right = iah0.a(3.0f);
            if (((Photo) arrayList.get(i4)).c != Integer.MIN_VALUE) {
                rect.bottom = iah0.a(3.0f);
            } else if (i4 > 0) {
                rect.top = iah0.a(-3.0f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ko() {
        int i2;
        PhotoListFragment photoListFragment = this;
        ArrayList<T> arrayList = photoListFragment.v0;
        if (arrayList.size() == 0 || photoListFragment.L0 == 0) {
            return;
        }
        ArrayList<m> arrayList2 = photoListFragment.K0;
        arrayList2.clear();
        int round = Math.round(photoListFragment.L0 / photoListFragment.getResources().getDisplayMetrics().density);
        float f2 = round;
        float f3 = 1.5f;
        int round2 = Math.round(f2 * 1.5f);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = 1000;
            float f4 = 180.0f;
            if (!it.hasNext()) {
                break;
            }
            int i5 = ((Photo) it.next()).Fb(604, z).d.b;
            int round3 = i5 == 0 ? 180 : Math.round(Math.min(f3, Math.max(0.5f, i5 / r11.c)) * 180.0f);
            boolean Lo = photoListFragment.Lo(i4);
            if (i3 + round3 > round2 || Lo) {
                float f5 = f2 / i3;
                int max = Math.max(i3, round);
                Iterator it2 = arrayList3.iterator();
                int i6 = z;
                while (it2.hasNext()) {
                    m mVar = (m) it2.next();
                    WeakHashMap weakHashMap = j6r0.a;
                    float f6 = f4;
                    mVar.b = Math.round(Math.min(f5, 1.1f) * iah0.a(f6));
                    int round4 = Math.round((mVar.c / max) * i2);
                    mVar.a = round4;
                    i2 -= round4;
                    max -= mVar.c;
                    if (Lo && i6 == arrayList3.size() - 1 && i2 < 100) {
                        mVar.a += i2;
                    }
                    i6++;
                    f4 = f6;
                }
                if (!Lo && i2 > 0) {
                    Iterator it3 = arrayList3.iterator();
                    int i7 = 0;
                    while (it3.hasNext()) {
                        m mVar2 = (m) it3.next();
                        int size = i2 / (arrayList3.size() - i7);
                        mVar2.a += size;
                        i2 -= size;
                        i7++;
                    }
                }
                arrayList2.addAll(arrayList3);
                arrayList3.clear();
                i3 = 0;
            }
            int i8 = i3 + round3;
            if (i8 <= round2) {
                m mVar3 = new m();
                mVar3.c = round3;
                arrayList3.add(mVar3);
                i3 = i8;
            }
            i4++;
            f3 = 1.5f;
            photoListFragment = this;
            z = 0;
        }
        if (arrayList3.size() > 0) {
            float min = Math.min(1.0f, f2 / i3);
            int max2 = Math.max(i3, round);
            Iterator it4 = arrayList3.iterator();
            int i9 = 0;
            while (it4.hasNext()) {
                m mVar4 = (m) it4.next();
                WeakHashMap weakHashMap2 = j6r0.a;
                mVar4.b = Math.round(iah0.a(180.0f) * min);
                int round5 = Math.round((mVar4.c / max2) * i2);
                mVar4.a = round5;
                i2 -= round5;
                max2 -= mVar4.c;
                if (i9 == arrayList3.size() - 1 && i2 < 10) {
                    mVar4.a += i2;
                }
                i9++;
            }
            arrayList2.addAll(arrayList3);
            arrayList3.clear();
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final boolean Lh() {
        String str;
        if (this.g0) {
            return true;
        }
        return this.O0 && (str = this.P0) != null && str.equals(this.Q0);
    }

    public boolean Lo(int i2) {
        return false;
    }

    public void No(Photo photo) {
        int i2;
        Intent intent;
        if (getArguments().getBoolean("select")) {
            Intent putExtra = new Intent().putExtra("photo", photo);
            FragmentActivity activity = getActivity();
            j34 a2 = rwi.d().p().a(this);
            if (activity != null && (intent = activity.getIntent()) != null) {
                UserId userId = (UserId) intent.getParcelableExtra("owner_id");
                int intExtra = intent.getIntExtra("post_id", 0);
                putExtra.putExtra("owner_id", userId);
                putExtra.putExtra("post_id", intExtra);
            }
            if (a2 != null) {
                a2.V2(putExtra);
                return;
            } else {
                Mf(-1, putExtra);
                return;
            }
        }
        ArrayList<T> arrayList = this.v0;
        int indexOf = arrayList.indexOf(photo);
        if (indexOf < 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown photo passed " + photo + ", data = " + arrayList);
            com.vk.metrics.eventtracking.b.a.a(illegalArgumentException);
            if (arrayList.isEmpty()) {
                throw illegalArgumentException;
            }
            i2 = 0;
        } else {
            i2 = indexOf;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Photo) it.next()).l = false;
        }
        this.N0 = myc0.d().g(i2, arrayList, requireContext(), Io(), o25.a().c());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        ArrayList<String> arrayList;
        if (i2 == 3890 && i3 == -1) {
            if (intent.hasExtra("files")) {
                arrayList = intent.getStringArrayListExtra("files");
            } else {
                arrayList = new ArrayList<>();
                arrayList.add(intent.getStringExtra(X3.i.b));
            }
            ArrayList arrayList2 = new ArrayList();
            UserId c2 = o25.a().c();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                PhotoAlbum photoAlbum = this.I0;
                int i4 = photoAlbum.b;
                UserId userId = photoAlbum.c;
                arrayList2.add(i4 > 0 ? new com.vk.upload.impl.tasks.b(next, c2, i4, userId, "", false) : new com.vk.upload.impl.tasks.a(next, c2, i4, userId, "", false));
            }
            PendingIntent a2 = t2i0.a(getActivity(), 0, getActivity().getIntent(), 33554432);
            ev6 ev6Var = new ev6(arrayList2, getString(R.string.uploading_photo));
            com.vk.upload.impl.a.g(ev6Var, new UploadNotification.a(a2, getString(R.string.photos_upload_ok), getString(R.string.photos_upload_ok_long)));
            com.vk.upload.impl.a.i(ev6Var);
            if (arrayList.size() >= 3) {
                this.R0.b(fsk.c.b(InAppReviewConditionKey.LOAD_3_MORE_PHOTOS, Collections.EMPTY_MAP).subscribe());
            }
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        this.I0 = (PhotoAlbum) getArguments().getParcelable("album");
        super.onAttach(context);
        boolean z = getArguments().getBoolean("no_album_header");
        this.M0 = !z;
        if (z) {
            setTitle(this.I0.g);
        }
        boolean z2 = getArguments().getBoolean("__is_tab");
        if (!z2) {
            setHasOptionsMenu(true);
        }
        boolean z3 = getArguments().getBoolean("prevent_load_in_on_attach");
        this.O0 = getArguments().getBoolean("from_pagination_from");
        boolean z4 = getArguments().getBoolean("autoload");
        if (!this.f0 && ((!z2 || z4) && !z3)) {
            qo();
        }
        if (z2) {
            return;
        }
        p0e0.b(this.I0.c, "photo_album_group");
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.o onCreateLayoutManager() {
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(1000);
        gridLayoutManager.x = new d();
        return gridLayoutManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z;
        boolean z2;
        MenuItem findItem;
        SubMenu subMenu;
        if (getArguments().getBoolean("__is_tab")) {
            return;
        }
        menuInflater.inflate(R.menu.photo_list, menu);
        boolean s = BuildInfo.s();
        MenuItem findItem2 = menu.findItem(R.id.add);
        if (s) {
            PhotoAlbum photoAlbum = this.I0;
            if (photoAlbum.b > 0 && (photoAlbum.n || o25.a().a(this.I0.c))) {
                z = true;
                findItem2.setVisible(z);
                z2 = this.I0.c.b != 0 || o25.a().a(this.I0.c);
                if (!z2 && this.I0.c.b < 0) {
                    Group b2 = xg5.a().b(this.I0.c);
                    z2 = b2 == null && b2.i;
                }
                menu.findItem(R.id.edit).setVisible(!s && this.I0.b > 0 && z2);
                menu.findItem(R.id.delete).setVisible(!s && this.I0.b > 0 && z2);
                menu.findItem(R.id.copy_link).setVisible(this.I0.b > -9000);
                findItem = menu.findItem(R.id.add);
                if (findItem != null || (subMenu = findItem.getSubMenu()) == null) {
                }
                u1u0.a(subMenu, getResources().getColor(R.color.vk_blue_400));
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item = subMenu.getItem(i2);
                    if (item != null) {
                        SpannableString spannableString = new SpannableString(item.getTitle());
                        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.vk_blue_400)), 0, spannableString.length(), 0);
                        item.setTitle(spannableString);
                    }
                }
                return;
            }
        }
        z = false;
        findItem2.setVisible(z);
        if (this.I0.c.b != 0) {
        }
        if (!z2) {
            Group b22 = xg5.a().b(this.I0.c);
            if (b22 == null) {
            }
        }
        menu.findItem(R.id.edit).setVisible(!s && this.I0.b > 0 && z2);
        menu.findItem(R.id.delete).setVisible(!s && this.I0.b > 0 && z2);
        menu.findItem(R.id.copy_link).setVisible(this.I0.b > -9000);
        findItem = menu.findItem(R.id.add);
        if (findItem != null) {
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.R0.dispose();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.copy_link) {
            ((ClipboardManager) getActivity().getSystemService("clipboard")).setText(dz5.r(this.I0));
            cvk.u(R.string.link_copied, false);
            return true;
        }
        if (itemId == R.id.add) {
            rwi.d().g().d(this, 3890, 0, new sw50.f.a(null, null, null, null, null));
            return false;
        }
        if (itemId == R.id.delete) {
            PhotoAlbumListFragment.Io(getActivity(), this.I0, o25.a().c(), new qi00(this, 19));
            return true;
        }
        if (itemId != R.id.edit) {
            return false;
        }
        EditAlbumFragment.b bVar = new EditAlbumFragment.b();
        bVar.j.putParcelable("album", this.I0);
        bVar.g(8295, this);
        return true;
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Toolbar toolbar;
        super.onViewCreated(view, bundle);
        if (!getArguments().getBoolean("__is_tab") && (toolbar = this.Q) != null && toolbar.getNavigationIcon() != null) {
            u1u0.j(this.Q, R.drawable.vk_icon_arrow_left_outline_28);
            this.Q.setOnClickListener(new a());
        }
        if (this.M0) {
            view.findViewById(R.id.shadow).setVisibility(8);
        }
        this.n0.setDrawSelectorOnTop(true);
        UsableRecyclerView usableRecyclerView = this.n0;
        WeakHashMap weakHashMap = j6r0.a;
        usableRecyclerView.setPadding(0, 0, iah0.a(-3.0f), 0);
        this.n0.setSelector(R.drawable.highlight);
        this.n0.setScrollBarStyle(0);
        this.n0.addItemDecoration(new b());
        view.addOnLayoutChangeListener(new c());
        if (!getArguments().getBoolean("__is_tab") && !getArguments().getBoolean("no_album_header")) {
            this.n0.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass4());
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        dnz dnzVar = new dnz(this, 7);
        fVar.getClass();
        this.R0.b(new i0(fVar, dnzVar).a0(asu0.a.d()).subscribe(new fl30(this, 10)));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final boolean uo(PaginatedList<Photo> paginatedList, int i2) {
        return (this.O0 && (paginatedList instanceof VKList)) ? !TextUtils.isEmpty(((VKList) paginatedList).j()) : super.uo(paginatedList, i2);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public void vo(int i2, int i3) {
        gqq gqqVar;
        if (this.z0) {
            this.P0 = null;
        }
        PhotoAlbum photoAlbum = this.I0;
        if (photoAlbum == null) {
            PhotoAlbum photoAlbum2 = (PhotoAlbum) getArguments().getParcelable("album");
            this.I0 = photoAlbum2;
            if (photoAlbum2 != null || getActivity() == null) {
                return;
            }
            finish();
            return;
        }
        int i4 = photoAlbum.b;
        if (i4 > -9000) {
            this.i0 = new jx2(new vea0(photoAlbum.c, i4, i2, i3, true), new fgz(this)).a();
            return;
        }
        if (i4 == -9000) {
            this.g0 = true;
            this.i0 = new jx2(new ifa0(i2, i3, photoAlbum.c, true), new e(this)).a();
            return;
        }
        if (i4 != -9001) {
            if (i4 == -9002) {
                this.i0 = new jx2(new zea0(photoAlbum.c, i2, i3), new g(this)).a();
            }
        } else {
            if (this.O0) {
                String str = this.P0;
                this.Q0 = str;
                gqqVar = new gqq(str, i3);
            } else {
                gqqVar = new gqq(i2, i3);
            }
            this.i0 = new jx2(gqqVar, new f(this)).a();
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public RecyclerView.Adapter wo() {
        if (this.J0 == null) {
            a920 a920Var = new a920();
            this.J0 = a920Var;
            if (this.M0) {
                a920Var.K0(new i());
            }
            this.J0.K0(new l(0, Integer.MAX_VALUE));
        }
        return this.J0;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void zo(PaginatedList<Photo> paginatedList) {
        super.zo(paginatedList);
        this.I0.f = paginatedList.i();
    }

    public void Mo() {
    }
}
