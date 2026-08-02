package com.vk.photos.legacy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.photos.PhotosGetAlbums;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.photos.legacy.PhotoListFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a5a0;
import xsna.asu0;
import xsna.bj50;
import xsna.c63;
import xsna.fnj;
import xsna.h7u0;
import xsna.iah0;
import xsna.j6r0;
import xsna.jx2;
import xsna.o25;
import xsna.o330;
import xsna.oz50;
import xsna.qi00;
import xsna.qp4;
import xsna.r6m;
import xsna.rpj0;
import xsna.vif0;
import xsna.x93;
import xsna.xg5;
import xsna.yea0;
import xsna.ysg0;
import xsna.z4a0;

/* loaded from: classes16.dex */
public class PhotoAlbumListFragment extends VKRecyclerFragment<PhotoAlbum> {
    public static final /* synthetic */ int O0 = 0;
    public final io.reactivex.rxjava3.disposables.b I0;
    public UserId J0;
    public boolean K0;
    public boolean L0;
    public i M0;
    public int N0;

    public class a extends RecyclerView.n {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            WeakHashMap weakHashMap = j6r0.a;
            rect.right = iah0.a(4.0f);
            if (childAdapterPosition >= 0) {
                int i = PhotoAlbumListFragment.O0;
                PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
                if (childAdapterPosition < photoAlbumListFragment.v0.size() && ((PhotoAlbum) photoAlbumListFragment.v0.get(childAdapterPosition)).b == Integer.MIN_VALUE) {
                    if (childAdapterPosition > 0) {
                        rect.top = iah0.a(-4.0f);
                        return;
                    }
                    return;
                }
            }
            rect.bottom = iah0.a(4.0f);
        }
    }

    public class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            if (i9 != i7 - i5) {
                int i10 = PhotoAlbumListFragment.O0;
                float f = i9;
                PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
                float f2 = photoAlbumListFragment.U ? 240.0f : 180.0f;
                WeakHashMap weakHashMap = j6r0.a;
                int round = Math.round(f / iah0.a(f2));
                photoAlbumListFragment.N0 = (i9 - ((round - 1) * iah0.a(4.0f))) / round;
                ((GridLayoutManager) photoAlbumListFragment.n0.getLayoutManager()).setSpanCount(round);
                photoAlbumListFragment.M0.notifyDataSetChanged();
                photoAlbumListFragment.n0.getViewTreeObserver().addOnPreDrawListener(new z4a0(photoAlbumListFragment));
            }
        }
    }

    public class c extends GridLayoutManager.c {
        public final /* synthetic */ GridLayoutManager d;

        public c(GridLayoutManager gridLayoutManager) {
            this.d = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            int i2 = PhotoAlbumListFragment.O0;
            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
            int size = photoAlbumListFragment.v0.size();
            GridLayoutManager gridLayoutManager = this.d;
            if (i >= size) {
                return gridLayoutManager.s;
            }
            if (((PhotoAlbum) photoAlbumListFragment.v0.get(i)).b == Integer.MIN_VALUE) {
                return gridLayoutManager.s;
            }
            return 1;
        }
    }

    public class d extends rpj0<PhotosGetAlbums.a> {
        public d(PhotoAlbumListFragment photoAlbumListFragment) {
            super(photoAlbumListFragment);
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            PhotosGetAlbums.a aVar = (PhotosGetAlbums.a) obj;
            ArrayList arrayList = new ArrayList();
            PhotoAlbum photoAlbum = new PhotoAlbum();
            photoAlbum.b = Integer.MIN_VALUE;
            photoAlbum.f = aVar.a.size();
            Iterator<PhotoAlbum> it = aVar.a.iterator();
            int i = 0;
            while (it.hasNext()) {
                PhotoAlbum next = it.next();
                if (i < 0 && next.b > 0) {
                    photoAlbum.f -= arrayList.size();
                    arrayList.add(photoAlbum);
                }
                arrayList.add(next);
                i = next.b;
            }
            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
            Resources resources = photoAlbumListFragment.getResources();
            int i2 = photoAlbum.f;
            photoAlbum.g = resources.getQuantityString(R.plurals.albums_count, i2, Integer.valueOf(i2));
            photoAlbumListFragment.Bo(arrayList, false);
        }
    }

    public abstract class e extends vif0<PhotoAlbum> implements UsableRecyclerView.e {
        public final TextView n;
        public final TextView o;
        public final VKImageView p;
        public final ImageView q;

        public e(int i) {
            super(i, PhotoAlbumListFragment.this.getActivity());
            this.n = (TextView) this.itemView.findViewById(R.id.album_title);
            this.o = (TextView) this.itemView.findViewById(R.id.album_qty);
            View findViewById = this.itemView.findViewById(R.id.album_thumb);
            if (findViewById instanceof VKImageView) {
                VKImageView vKImageView = (VKImageView) findViewById;
                this.p = vKImageView;
                vKImageView.setPlaceholderColor(-855310);
            }
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.album_actions);
            this.q = imageView;
            this.itemView.setLayoutParams(new RecyclerView.p(-1, Math.round(PhotoAlbumListFragment.this.N0 * 0.75f)));
            imageView.setOnClickListener(new qp4(this, 6));
        }

        @Override // xsna.vif0
        public final void i6(PhotoAlbum photoAlbum) {
            VKImageView vKImageView;
            PhotoAlbum photoAlbum2 = photoAlbum;
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
            layoutParams.height = Math.round(photoAlbumListFragment.N0 * 0.75f);
            this.n.setText(photoAlbum2.g);
            this.o.setText(String.valueOf(photoAlbum2.f));
            this.q.setVisibility((!photoAlbumListFragment.K0 || photoAlbum2.b <= 0 || photoAlbumListFragment.L0) ? 8 : 0);
            if (photoAlbum2.f <= 0 || (vKImageView = this.p) == null) {
                return;
            }
            vKImageView.load(photoAlbum2.k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
            if (photoAlbumListFragment.getArguments().getBoolean("select_album")) {
                photoAlbumListFragment.Mf(-1, new Intent().putExtra("album", (Parcelable) this.m));
                return;
            }
            new Bundle().putParcelable("album", (Parcelable) this.m);
            if (!photoAlbumListFragment.getArguments().getBoolean("select")) {
                new PhotoListFragment.h((PhotoAlbum) this.m).k(photoAlbumListFragment.getActivity());
                return;
            }
            PhotoListFragment.h hVar = new PhotoListFragment.h((PhotoAlbum) this.m);
            hVar.j.putBoolean("select", true);
            hVar.g(8294, photoAlbumListFragment);
        }
    }

    public static class f extends oz50 {
        public f() {
            super(PhotoAlbumListFragment.class, null, null);
        }
    }

    public class g extends e {
    }

    public class h extends e {
    }

    public class i extends UsableRecyclerView.c<vif0<PhotoAlbum>> {
        public i() {
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            int i3 = PhotoAlbumListFragment.O0;
            return ((PhotoAlbum) PhotoAlbumListFragment.this.v0.get(i)).k;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            int i2 = PhotoAlbumListFragment.O0;
            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
            return (((PhotoAlbum) photoAlbumListFragment.v0.get(i)).f <= 0 || TextUtils.isEmpty(((PhotoAlbum) photoAlbumListFragment.v0.get(i)).k)) ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = PhotoAlbumListFragment.O0;
            return PhotoAlbumListFragment.this.v0.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            int i2 = PhotoAlbumListFragment.O0;
            PhotoAlbum photoAlbum = (PhotoAlbum) PhotoAlbumListFragment.this.v0.get(i);
            if (photoAlbum.b == Integer.MIN_VALUE) {
                return 2;
            }
            return (photoAlbum.f == 0 || TextUtils.isEmpty(photoAlbum.k)) ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            int i2 = PhotoAlbumListFragment.O0;
            ((vif0) e0Var).V5((PhotoAlbum) PhotoAlbumListFragment.this.v0.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
            if (i == 1) {
                return photoAlbumListFragment.new g(R.layout.photoalbums_item_empty);
            }
            if (i != 2) {
                return photoAlbumListFragment.new h(R.layout.photoalbums_item);
            }
            FragmentActivity activity = photoAlbumListFragment.getActivity();
            j jVar = new j(LayoutInflater.from(activity).inflate(R.layout.list_section_header, (ViewGroup) photoAlbumListFragment.n0, false));
            jVar.l = null;
            jVar.itemView.setBackgroundDrawable(null);
            return jVar;
        }
    }

    public class j extends vif0<PhotoAlbum> {
        @Override // xsna.vif0
        public final void i6(PhotoAlbum photoAlbum) {
            ((TextView) this.itemView).setText(photoAlbum.g);
        }
    }

    public PhotoAlbumListFragment() {
        super(1);
        this.I0 = new io.reactivex.rxjava3.disposables.b();
        this.J0 = UserId.d;
    }

    public static void Io(FragmentActivity fragmentActivity, PhotoAlbum photoAlbum, UserId userId, @Nullable qi00 qi00Var) {
        h7u0.a aVar = new h7u0.a(fragmentActivity);
        aVar.g0(R.string.delete_album);
        aVar.U(R.string.delete_album_confirm);
        aVar.c0(R.string.yes, new a5a0(fragmentActivity, photoAlbum, userId, qi00Var));
        aVar.W(R.string.no, null);
        aVar.m();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2;
        int i4 = 0;
        if (i2 == 8294 && i3 == -1) {
            FragmentActivity activity = getActivity();
            if (activity != null && (intent2 = activity.getIntent()) != null) {
                UserId userId = (UserId) intent2.getParcelableExtra("owner_id");
                int intExtra = intent2.getIntExtra("post_id", 0);
                intent.putExtra("owner_id", userId);
                intent.putExtra("post_id", intExtra);
            }
            Mf(-1, intent);
            return;
        }
        if (i2 != 8295 || i3 != -1) {
            return;
        }
        PhotoAlbum photoAlbum = (PhotoAlbum) intent.getParcelableExtra("album");
        int i5 = 0;
        while (true) {
            ArrayList<T> arrayList = this.v0;
            if (i4 >= arrayList.size()) {
                arrayList.add(i5, photoAlbum);
                this.M0.notifyItemInserted(i5);
                return;
            }
            if (((PhotoAlbum) arrayList.get(i4)).b == Integer.MIN_VALUE) {
                i5 = i4 + 1;
            }
            if (((PhotoAlbum) arrayList.get(i4)).b == photoAlbum.b) {
                arrayList.set(i4, photoAlbum);
                this.M0.notifyItemChanged(i4);
                return;
            }
            i4++;
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        UserId userId = getArguments().getParcelable("uid") != null ? (UserId) getArguments().getParcelable("uid") : UserId.d;
        this.J0 = userId;
        boolean z = userId.b == 0 || o25.a().a(this.J0);
        this.K0 = z;
        if (!z && this.J0.b < 0) {
            Group b2 = xg5.a().b(this.J0);
            this.K0 = b2 != null && b2.i;
        }
        this.L0 = getArguments().getBoolean("select") || getArguments().getBoolean("select_album");
        if (getArguments() != null && getArguments().containsKey("title")) {
            setTitle(getArguments().getString("title"));
        } else if (!getArguments().getBoolean("no_title")) {
            setTitle(R.string.albums);
        }
        if (!getArguments().getBoolean("__is_tab")) {
            qo();
        } else if (wo().getItemCount() > 0) {
            h();
        } else {
            po();
        }
        if (this.L0) {
            return;
        }
        setHasOptionsMenu(true);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.o onCreateLayoutManager() {
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(1);
        gridLayoutManager.x = new c(gridLayoutManager);
        return gridLayoutManager;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.photoalbums, menu);
        menu.findItem(R.id.create).setVisible(this.K0 && BuildInfo.s() && (!getArguments().getBoolean("select") || getArguments().getBoolean("select_album")));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.I0.dispose();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.create) {
            return true;
        }
        Bundle bundle = new Bundle();
        UserId userId = this.J0;
        if (userId == null) {
            userId = UserId.d;
        }
        bundle.putParcelable("owner_id", userId);
        oz50 oz50Var = new oz50(EditAlbumFragment.class, null, bundle);
        TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
        aVar.b();
        Handler handler = x93.a;
        Activity b2 = c63.b();
        if (b2 != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(b2)) {
                oz50Var.i = aVar;
            }
        }
        oz50Var.g(8295, this);
        return true;
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.n0.setDrawSelectorOnTop(true);
        UsableRecyclerView usableRecyclerView = this.n0;
        WeakHashMap weakHashMap = j6r0.a;
        usableRecyclerView.setPadding(0, 0, iah0.a(-4.0f), 0);
        this.n0.setSelector(R.drawable.highlight);
        this.n0.addItemDecoration(new a());
        this.n0.addOnLayoutChangeListener(new b());
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        bj50 bj50Var = new bj50(this, 3);
        fVar.getClass();
        this.I0.b(new i0(fVar, bj50Var).a0(asu0.a.d()).subscribe(new o330(this, 7)));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i2, int i3) {
        if (this.J0 == null) {
            L.G("can't get data on empty user uid");
            return;
        }
        r6m.a.getClass();
        this.i0 = new jx2(new PhotosGetAlbums(this.J0, !getArguments().getBoolean("select_album"), new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k())), new d(this)).a();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        if (this.M0 == null) {
            this.M0 = new i();
        }
        return this.M0;
    }
}
