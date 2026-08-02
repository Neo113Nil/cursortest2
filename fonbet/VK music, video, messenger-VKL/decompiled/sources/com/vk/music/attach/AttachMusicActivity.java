package com.vk.music.attach;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.track.MusicTrackId;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.a34;
import xsna.aa40;
import xsna.bpn0;
import xsna.cmy;
import xsna.cvk;
import xsna.d94;
import xsna.dhr0;
import xsna.dm10;
import xsna.e3m;
import xsna.gko;
import xsna.h7u0;
import xsna.i3u;
import xsna.j5g;
import xsna.k840;
import xsna.kb;
import xsna.l6g;
import xsna.lh3;
import xsna.m4;
import xsna.o24;
import xsna.oq;
import xsna.p24;
import xsna.pn40;
import xsna.q24;
import xsna.qbb0;
import xsna.qfb0;
import xsna.qo50;
import xsna.t24;
import xsna.tk5;
import xsna.tlo0;
import xsna.tq;
import xsna.u1u0;
import xsna.u2b0;
import xsna.vtk0;
import xsna.wlh0;
import xsna.x24;
import xsna.y24;
import xsna.ym40;
import xsna.z24;

/* loaded from: classes3.dex */
public final class AttachMusicActivity extends VKActivity implements t24.c, View.OnClickListener {
    public static final /* synthetic */ int N = 0;
    public cmy A;
    public ArrayList<MusicTrack> B;
    public ArrayList<MusicTrackId> C;
    public ArrayList<MusicTrackId> D;
    public final ArrayList<MusicTrackId> E;
    public ym40 F;
    public qfb0 G;
    public qbb0 H;
    public HashMap I;
    public HashMap J;
    public final bpn0 K;
    public Long L;
    public UserId M;
    public final aa40 v;
    public c w;
    public x24 x;
    public SwipeRefreshLayout y;
    public RecyclerView z;

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AttachMusicActivity.super.onBackPressed();
        }
    }

    public AttachMusicActivity() {
        pn40 pn40Var = k840.a;
        this.v = new aa40();
        this.w = EmptyDisposable.INSTANCE;
        this.E = new ArrayList<>();
        this.K = new bpn0(new m4(this, 8));
        this.L = -1L;
        this.M = UserId.d;
    }

    @Override // xsna.t24.c
    @Nullable
    public final Bundle B() {
        HashMap hashMap = this.J;
        if (hashMap != null) {
            return (Bundle) hashMap.get(wlh0.class);
        }
        return null;
    }

    @Override // xsna.t24.c
    public final void C() {
        x24 x24Var = this.x;
        x24Var.b.setAfter(null);
        x24Var.a();
    }

    @Override // xsna.t24.c
    @NonNull
    public final ym40 C0() {
        if (this.F == null) {
            UserId userId = this.M;
            Bundle bundle = new Bundle();
            bundle.putParcelable("MusicLoader.key.owner_id", userId);
            this.F = (ym40) U0(ym40.class, bundle);
        }
        return this.F;
    }

    @Override // xsna.t24.c
    public final o24 D(RecyclerView.Adapter... adapterArr) {
        return new o24(this, adapterArr);
    }

    @Override // xsna.t24.c
    public final void E() {
        x24 x24Var = this.x;
        x24Var.b.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_search_24), tq.h(tlo0.Companion, R.string.accessibility_search), new d94(x24Var, 1), null, null, null, 56), null, 6));
        x24Var.a();
    }

    @Override // xsna.t24.c
    public final void I0(@NonNull SparseArray<Parcelable> sparseArray) {
        this.z.restoreHierarchyState(sparseArray);
    }

    @Override // xsna.t24.c
    public final boolean J0(@NonNull MusicTrack musicTrack) {
        MusicTrackId musicTrackId = new MusicTrackId(musicTrack.c.b, musicTrack.b, musicTrack.r);
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        if (this.D.contains(musicTrackId)) {
            if (X1().contains(musicTrackId)) {
                X1().remove(musicTrackId);
            } else {
                X1().add(musicTrackId);
            }
        } else if (V1().contains(musicTrack)) {
            V1().remove(musicTrack);
        } else {
            if (V1().size() + 1 > 100) {
                cvk.w(getString(R.string.music_toast_attach_limit_exceeded, 100), false);
                return false;
            }
            V1().add(musicTrack);
        }
        Z1();
        return true;
    }

    @Override // xsna.t24.c
    public final void L0(@NonNull Class cls) {
        Fragment U1 = U1(cls);
        if (U1 != null) {
            HashMap hashMap = this.I;
            if (hashMap != null) {
                hashMap.remove(cls);
            }
            if (getSupportFragmentManager().J) {
                return;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.q(U1);
            aVar.k(true);
        }
    }

    @Override // xsna.t24.c
    public final Long M() {
        return this.L;
    }

    @Override // xsna.t24.c
    public final void N0(@Nullable lh3 lh3Var) {
        this.x.d = lh3Var;
    }

    @Override // xsna.t24.c
    public final void N2() {
        x24 x24Var = this.x;
        VkTopBar vkTopBar = x24Var.b;
        vkTopBar.setBefore(null);
        vkTopBar.setBack(new VkTopBar.b(new y24(x24Var), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.t24.c
    public final void O(int i) {
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this.x.b.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, i), null, null, null, null, 30), cVar, objArr, objArr2, 14));
    }

    @Override // xsna.t24.c
    public final void P0() {
        x24 x24Var = this.x;
        x24Var.i = true;
        x24Var.a();
        x24Var.i = false;
    }

    @Override // xsna.t24.c
    @NonNull
    public final qfb0 Q0() {
        if (this.G == null) {
            UserId userId = this.M;
            Bundle bundle = new Bundle();
            bundle.putParcelable("PlaylistsLoader.key.ownerId", userId);
            this.G = (qfb0) U0(qfb0.class, bundle);
        }
        return this.G;
    }

    @Override // xsna.t24.c
    public final void R0(@Nullable SwipeRefreshLayout.f fVar) {
        this.y.setOnRefreshListener(fVar);
    }

    @Override // xsna.t24.c
    @NonNull
    public final ArrayList S() {
        return this.E;
    }

    @Override // xsna.t24.c
    @NonNull
    public final <T extends Fragment> T U0(@NonNull Class cls, @Nullable Bundle bundle) {
        T t = (T) U1(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Fragment.instantiate(this, cls.getName(), bundle);
        if (this.I == null) {
            this.I = new HashMap();
        }
        this.I.put(cls, t2);
        if (!getSupportFragmentManager().J) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a b2 = tk5.b(supportFragmentManager, supportFragmentManager);
            b2.f(0, t2, cls.getSimpleName().concat(".tag"), 1);
            b2.k(true);
        }
        return t2;
    }

    @Nullable
    public final Fragment U1(@NonNull Class cls) {
        HashMap hashMap = this.I;
        Fragment fragment = hashMap != null ? (Fragment) hashMap.get(cls) : null;
        if (fragment == null) {
            fragment = getSupportFragmentManager().H(cls.getSimpleName().concat(".tag"));
            if (fragment == null) {
                return null;
            }
            if (this.I == null) {
                this.I = new HashMap();
            }
            this.I.put(cls, fragment);
        }
        return fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 == null) goto L6;
     */
    @Override // xsna.t24.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(@Nullable String str) {
        String str2;
        x24 x24Var = this.x;
        if (str != null) {
            x24Var.getClass();
            str2 = str.toString();
        }
        str2 = "";
        x24Var.g = str2;
        String valueOf = String.valueOf(str);
        Iterator it = j5g.O0(x24Var.c).iterator();
        while (it.hasNext()) {
            ((t24.d) it.next()).a(valueOf);
        }
        x24Var.a();
    }

    @NonNull
    public final ArrayList V1() {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        return this.B;
    }

    @Override // xsna.t24.c
    @NonNull
    public final qbb0 W0() {
        if (this.H == null) {
            this.H = (qbb0) U0(qbb0.class, null);
        }
        return this.H;
    }

    @NonNull
    public final t24 W1() {
        return (t24) getSupportFragmentManager().H(getSupportFragmentManager().K() + ".tag");
    }

    @Override // xsna.t24.c
    public final void X(@NonNull t24 t24Var, @NonNull Class<? extends t24> cls, @Nullable Bundle bundle) {
        if (isFinishing()) {
            return;
        }
        Y1(t24Var, cls, bundle, true);
    }

    @NonNull
    public final ArrayList X1() {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        return this.C;
    }

    @Override // xsna.t24.c
    public final void Y0(@Nullable t24.b bVar) {
        this.A.e = bVar;
    }

    public final void Y1(@Nullable t24 t24Var, @NonNull Class<? extends t24> cls, @Nullable Bundle bundle, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.J) {
            return;
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        if (t24Var != null) {
            aVar.q(t24Var);
        }
        String a2 = l6g.a(z ? supportFragmentManager.K() + 1 : 0, ".tag");
        aVar.f(0, Fragment.instantiate(this, cls.getName(), bundle), a2, 1);
        if (t24Var != null && z) {
            aVar.d(t24Var.getTag() + "->" + a2);
        }
        aVar.k(false);
    }

    public final void Z1() {
        ArrayList<MusicTrackId> arrayList = this.E;
        arrayList.clear();
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        arrayList.addAll(this.D);
        arrayList.removeAll(X1());
        arrayList.addAll(MusicTrackId.a(V1()));
    }

    @Override // xsna.t24.c
    public final void a1(@NonNull SparseArray<Parcelable> sparseArray) {
        this.z.saveHierarchyState(sparseArray);
    }

    @Override // xsna.t24.c
    public final void b0(int i) {
        x24 x24Var = this.x;
        VkTopBar vkTopBar = x24Var.b;
        vkTopBar.setBefore(null);
        vkTopBar.setBack(new VkTopBar.b(new a34(x24Var, 0), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
        x24Var.h = i;
        x24Var.a();
    }

    @Override // xsna.t24.c
    @Nullable
    public final RecyclerView.Adapter getAdapter() {
        return this.z.getAdapter();
    }

    @Override // xsna.t24.c
    @NonNull
    public final String h1() {
        return this.x.g;
    }

    @Override // xsna.t24.c
    public final void j0() {
        x24 x24Var = this.x;
        VkTopBar vkTopBar = x24Var.b;
        vkTopBar.setBack(null);
        vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.accessibility_close), new z24(x24Var, 0), null, null, 12));
    }

    @Override // xsna.t24.c
    public final void j1(@NonNull t24.d dVar) {
        this.x.c.remove(dVar);
    }

    @Override // xsna.t24.c
    public final void k0(@Nullable i3u i3uVar) {
        this.x.f = i3uVar;
    }

    @Override // xsna.t24.c
    public final void l() {
        x24 x24Var = this.x;
        x24Var.b.setAfter(null);
        x24Var.j = true;
        x24Var.a();
    }

    @Override // xsna.t24.c
    public final void l0(@NonNull t24.d dVar) {
        this.x.c.add(dVar);
    }

    @Override // xsna.t24.c
    public final void l1() {
        this.w.dispose();
        this.w = vtk0.d().e(this, new q24(this), 3);
    }

    @Override // xsna.t24.c
    public final void m(@Nullable kb kbVar) {
        this.x.e = kbVar;
    }

    @Override // xsna.t24.c
    public final p24 n0(List list) {
        return new p24(this, list);
    }

    @Override // xsna.t24.c
    public final void o1(@NonNull Bundle bundle) {
        if (this.J == null) {
            this.J = new HashMap();
        }
        this.J.put(wlh0.class, bundle);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (W1().vn()) {
            return;
        }
        if (!(W1() instanceof qo50) || (this.B.isEmpty() && this.C.isEmpty())) {
            super.onBackPressed();
            return;
        }
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(this);
        c.g0(R.string.confirm);
        c.U(R.string.music_alert_exit_edit_mode_message);
        c.c0(R.string.dont_save, new b());
        c.W(R.string.cancel, new a());
        c.m();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.music_attach_button) {
            Intent intent = new Intent();
            ArrayList<MusicTrack> arrayList = this.B;
            this.v.getClass();
            setResult(-1, intent.putExtra("result_attached", aa40.b("result_attached", arrayList)).putParcelableArrayListExtra("result_removed", this.C));
            finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x014f, code lost:
    
        if (r1 == null) goto L24;
     */
    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTheme(dhr0.C().c);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_window_themable);
        dhr0.W(getWindow().getDecorView());
        dhr0.r0(this);
        dhr0.v0(this);
        setContentView(R.layout.music_select_music);
        Window window = getWindow();
        dhr0.a.getClass();
        u1u0.h(window, e3m.f(R.attr.vk_ui_header_background, dhr0.E()));
        this.x = new x24(this, (VkTopBar) findViewById(R.id.music_toolbar));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.music_refresh_layout);
        this.y = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.vk_blue_400);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.music_recycler);
        this.z = recyclerView;
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.z.setLayoutManager(linearLayoutManager);
        cmy cmyVar = new cmy(linearLayoutManager, 15);
        this.A = cmyVar;
        this.z.addOnScrollListener(cmyVar);
        findViewById(R.id.music_attach_button).setOnClickListener(this);
        Intent intent = getIntent();
        ArrayList<MusicTrack> arrayList = null;
        this.D = (intent.getExtras() == null || !intent.hasExtra("AttachMusicActivity.key.currentTracks")) ? null : intent.getExtras().getParcelableArrayList("AttachMusicActivity.key.currentTracks");
        if (getIntent().getExtras() != null) {
            this.L = Long.valueOf(getIntent().getExtras().getLong("playlist_pid", -1L));
            this.M = (UserId) getIntent().getExtras().getParcelable("AttachMusicActivity.key.ownerId");
        }
        aa40 aa40Var = this.v;
        if (bundle == null) {
            Z1();
            Y1(null, qo50.class, null, false);
            Intent intent2 = getIntent();
            if (intent2.getExtras() != null && intent2.hasExtra("AttachMusicActivity.key.attachedTracks")) {
                Bundle bundle2 = intent2.getExtras().getBundle("AttachMusicActivity.key.attachedTracks");
                aa40Var.getClass();
                arrayList = aa40.a(MusicTrack.class, bundle2, "AttachMusicActivity.key.attachedTracks");
            }
            this.B = arrayList;
            Z1();
            return;
        }
        Bundle bundle3 = bundle.getBundle("AttachMusicActivity.key.attachedTracks");
        aa40Var.getClass();
        this.B = aa40.a(MusicTrack.class, bundle3, "AttachMusicActivity.key.attachedTracks");
        this.C = bundle.getParcelableArrayList("AttachMusicActivity.key.removedTracks");
        this.M = (UserId) bundle.getParcelable("AttachMusicActivity.key.ownerId");
        x24 x24Var = this.x;
        String string = bundle.getString("AttachMusicActivity.key.searchText");
        if (string != null) {
            x24Var.getClass();
            str = string.toString();
        }
        str = "";
        x24Var.g = str;
        String valueOf = String.valueOf(string);
        Iterator it = j5g.O0(x24Var.c).iterator();
        while (it.hasNext()) {
            ((t24.d) it.next()).a(valueOf);
        }
        x24Var.a();
        Z1();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.w.dispose();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ArrayList<MusicTrack> arrayList = this.B;
        this.v.getClass();
        bundle.putBundle("AttachMusicActivity.key.attachedTracks", aa40.b("AttachMusicActivity.key.attachedTracks", arrayList));
        bundle.putParcelableArrayList("AttachMusicActivity.key.removedTracks", this.C);
        bundle.putParcelable("AttachMusicActivity.key.ownerId", this.M);
        bundle.putString("AttachMusicActivity.key.searchText", this.x.g);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        dm10.e().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.t24.c
    public final void p(@Nullable String str) {
        VkTopBar vkTopBar = this.x.b;
        tlo0.a aVar = tlo0.Companion;
        String obj = str != null ? str.toString() : null;
        if (obj == null) {
            obj = "";
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(aVar, obj), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
    }

    @Override // xsna.t24.c
    public final void p0() {
        HashMap hashMap = this.J;
        if (hashMap != null) {
            hashMap.remove(wlh0.class);
        }
    }

    @Override // xsna.t24.c
    public final UserId q() {
        return this.M;
    }

    @Override // xsna.t24.c
    public final u2b0 r() {
        return ((AudioModelsComponent) this.K.getValue()).r();
    }

    @Override // xsna.t24.c
    public final void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        this.z.setAdapter(adapter);
    }

    @Override // xsna.t24.c
    public final void setRefreshing(boolean z) {
        this.y.setRefreshing(false);
    }

    @Override // xsna.t24.c
    public final void x0() {
        getSupportFragmentManager().Y();
    }

    @Override // xsna.t24.c
    public final boolean z() {
        return vtk0.d().b(this);
    }

    public class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }
}
