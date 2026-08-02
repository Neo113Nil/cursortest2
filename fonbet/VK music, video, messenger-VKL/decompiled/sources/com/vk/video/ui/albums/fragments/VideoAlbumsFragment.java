package com.vk.video.ui.albums.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.imageloader.ImageScreenSize;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.base.GridFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.anj;
import xsna.cuz;
import xsna.cxb0;
import xsna.e43;
import xsna.ens0;
import xsna.fkq0;
import xsna.fnj;
import xsna.fxc0;
import xsna.hf8;
import xsna.iah0;
import xsna.j6r0;
import xsna.jbs;
import xsna.jx2;
import xsna.o25;
import xsna.pvo0;
import xsna.rpj0;
import xsna.ucp;
import xsna.vif0;
import xsna.xg5;

/* loaded from: classes7.dex */
public class VideoAlbumsFragment extends GridFragment<VideoAlbum> {
    public static final /* synthetic */ int P0 = 0;
    public boolean L0;
    public boolean M0;
    public UserId N0;
    public final a O0;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VideoAlbum videoAlbum;
            boolean equals = "com.vkontakte.android.RELOAD_VIDEO_ALBUMS".equals(intent.getAction());
            VideoAlbumsFragment videoAlbumsFragment = VideoAlbumsFragment.this;
            if (equals && intent.getIntExtra("target_id", 0) == videoAlbumsFragment.N0.b) {
                videoAlbumsFragment.Do();
            }
            if ("com.vkontakte.android.VIDEO_ALBUM_CREATED".equals(intent.getAction()) && videoAlbumsFragment.f0 && (videoAlbum = (VideoAlbum) intent.getParcelableExtra("album")) != null && videoAlbumsFragment.N0 == videoAlbum.f) {
                videoAlbumsFragment.v0.add(0, videoAlbum);
                videoAlbumsFragment.wo().notifyItemInserted(0);
            }
        }
    }

    public class b extends rpj0<VKList<VideoAlbum>> {
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VideoAlbumsFragment videoAlbumsFragment, int i, int i2) {
            super(videoAlbumsFragment);
            this.d = i;
            this.e = i2;
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            VKList vKList = (VKList) obj;
            VideoAlbumsFragment.this.Bo(vKList, this.d + this.e < vKList.i());
        }
    }

    public class c extends GridFragment<VideoAlbum>.b<d> {
        public c() {
            super();
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            VideoAlbumsFragment videoAlbumsFragment = VideoAlbumsFragment.this;
            Context mo2getContext = videoAlbumsFragment.mo2getContext();
            HashSet hashSet = iah0.a;
            ImageScreenSize imageScreenSize = fnj.d(mo2getContext) ? ImageScreenSize.BIG : ImageScreenSize.SMALL;
            int i3 = VideoAlbumsFragment.P0;
            ImageSize Cb = ((VideoAlbum) videoAlbumsFragment.v0.get(i)).g.Cb(imageScreenSize.h(), true, false);
            if (Cb == null) {
                return null;
            }
            return Cb.d.d;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return VideoAlbumsFragment.this.new d(viewGroup);
        }
    }

    public class d extends vif0<VideoAlbum> implements View.OnClickListener {
        public final VkText n;
        public final VkText o;
        public final VkText p;
        public final VkImage q;
        public final View r;
        public final View s;

        public class a {
            public a() {
            }
        }

        public d(@NonNull ViewGroup viewGroup) {
            super(viewGroup, R.layout.video_album_item, 0);
            this.n = (VkText) this.itemView.findViewById(R.id.title);
            this.o = (VkText) this.itemView.findViewById(R.id.subtitle);
            this.p = (VkText) this.itemView.findViewById(R.id.info);
            this.q = (VkImage) this.itemView.findViewById(R.id.photo);
            this.r = this.itemView.findViewById(R.id.lock);
            View findViewById = this.itemView.findViewById(R.id.options);
            this.s = findViewById;
            findViewById.setOnClickListener(this);
            this.itemView.setOnClickListener(this);
        }

        @Override // xsna.vif0
        public final void i6(VideoAlbum videoAlbum) {
            VideoAlbum videoAlbum2 = videoAlbum;
            VkImage vkImage = this.q;
            Context context = vkImage.getContext();
            HashSet hashSet = iah0.a;
            ImageSize Cb = videoAlbum2.g.Cb((fnj.d(context) ? ImageScreenSize.BIG : ImageScreenSize.SMALL).h(), true, false);
            vkImage.o0(Cb == null ? null : Cb.d.d, null);
            ucp ucpVar = ucp.a;
            this.n.setText(ucp.i(videoAlbum2.c));
            this.o.setText(h6(R.string.video_album_time_updated, pvo0.j(videoAlbum2.h * 1000, false, false)));
            Resources b6 = b6();
            int i = videoAlbum2.e;
            this.p.setText(b6.getQuantityString(R.plurals.album_video_count, i, Integer.valueOf(i)));
            this.s.setVisibility(VideoAlbumsFragment.this.L0 ? 0 : 8);
            PrivacySetting.PrivacyRule privacyRule = videoAlbum2.i.isEmpty() ? null : videoAlbum2.i.get(0);
            this.r.setVisibility((privacyRule == null || Collections.singletonList(PrivacyRules.a.d).equals(privacyRule.zb())) ? 8 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Group C0;
            View view2 = this.itemView;
            VideoAlbumsFragment videoAlbumsFragment = VideoAlbumsFragment.this;
            if (view == view2) {
                fxc0.B().Y().b(((VideoAlbum) this.m).d(), videoAlbumsFragment.M0, new jbs(videoAlbumsFragment));
                return;
            }
            if (view == this.s) {
                boolean z = ((VideoAlbum) this.m).f.b < 0 && (C0 = xg5.a().D().C0(fkq0.e(((VideoAlbum) this.m).f))) != null && C0.e();
                cxb0 cxb0Var = new cxb0(videoAlbumsFragment.getActivity(), view, 0);
                boolean a2 = o25.a().a(((VideoAlbum) this.m).f);
                f fVar = cxb0Var.a;
                if (a2 || z) {
                    fVar.add(0, R.id.edit_album, 0, R.string.edit);
                    fVar.add(0, R.id.remove_album, 0, R.string.delete);
                }
                fVar.add(0, R.id.copy_link, 0, R.string.copy_link);
                cxb0Var.d = new a();
                i iVar = cxb0Var.c;
                if (iVar.b()) {
                    return;
                }
                if (iVar.e == null) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                iVar.d(0, 0, false, false);
            }
        }
    }

    public VideoAlbumsFragment() {
        super(50);
        this.N0 = UserId.d;
        this.O0 = new a();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final GridFragment<VideoAlbum>.b<?> Io() {
        return new c();
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment
    public final int Ko() {
        int i;
        int width = (this.n0.getWidth() - this.n0.getPaddingLeft()) - this.n0.getPaddingRight();
        if (this.V >= 600) {
            WeakHashMap weakHashMap = j6r0.a;
            i = iah0.a(256.0f);
        } else {
            i = width;
        }
        if (width * i == 0) {
            return 1;
        }
        return width / i;
    }

    @Override // com.vkontakte.android.fragments.base.GridFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.f0) {
            qo();
        } else {
            i0();
            q();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return;
        }
        if (i == 102) {
            Mf(-1, intent);
            return;
        }
        if (i != 103 || !this.f0) {
            return;
        }
        VideoAlbum videoAlbum = (VideoAlbum) intent.getParcelableExtra("album");
        int i3 = 0;
        while (true) {
            ArrayList<T> arrayList = this.v0;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (((VideoAlbum) arrayList.get(i3)).equals(videoAlbum)) {
                arrayList.set(i3, videoAlbum);
                wo().notifyItemChanged(i3);
                return;
            }
            i3++;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.N0 = (UserId) getArguments().getParcelable("owner_id");
        this.M0 = getArguments().getBoolean("select");
        boolean a2 = o25.a().a(this.N0);
        this.L0 = a2;
        if (!a2 && this.N0.b < 0) {
            Group C0 = xg5.a().D().C0(fkq0.e(this.N0));
            this.L0 = C0 != null && C0.f();
        }
        Context context = e43.a;
        IntentFilter intentFilter = new IntentFilter("com.vkontakte.android.RELOAD_VIDEO_ALBUMS");
        String str = hf8.a;
        a aVar = this.O0;
        anj.d(context, aVar, intentFilter, str, 4);
        cuz.a(getActivity()).b(aVar, new IntentFilter("com.vkontakte.android.VIDEO_ALBUM_CREATED"));
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Context context = e43.a;
        a aVar = this.O0;
        context.unregisterReceiver(aVar);
        cuz.a(getActivity()).d(aVar);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        new jx2(new ens0(this.N0, i, i2), new b(this, i, i2)).a();
    }
}
