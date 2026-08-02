package com.vk.superapp.browser.internal.ui.friends;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.superapp.core.ui.component.VkSdkActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aj6;
import xsna.bjm0;
import xsna.c5g;
import xsna.dhr0;
import xsna.e370;
import xsna.gfx0;
import xsna.gzw;
import xsna.hg1;
import xsna.iwu0;
import xsna.izs;
import xsna.j5g;
import xsna.jjc;
import xsna.jz30;
import xsna.krv0;
import xsna.l960;
import xsna.n3b0;
import xsna.oek0;
import xsna.oqx0;
import xsna.p350;
import xsna.pyr0;
import xsna.qno0;
import xsna.s3q0;
import xsna.t520;
import xsna.tgn0;
import xsna.yaq0;
import xsna.zxv0;

/* compiled from: VkFriendsPickerActivity.kt */
/* loaded from: classes6.dex */
public final class VkFriendsPickerActivity extends VkSdkActivity {
    public static final /* synthetic */ int p = 0;
    public RecyclerPaginatedView f;
    public c g;
    public Toolbar h;
    public BaseVkSearchView i;
    public ImageButton j;
    public boolean k;
    public long l;
    public String m;
    public iwu0 n;
    public zxv0 o;

    /* compiled from: VkFriendsPickerActivity.kt */
    public static final class a {
        public static Intent a(FragmentActivity fragmentActivity, long j, String str) {
            return new Intent(fragmentActivity, (Class<?>) VkFriendsPickerActivity.class).putExtra("isMulti", true).putExtra("title", fragmentActivity.getString(R.string.vk_games_invite_friends)).putExtra("appId", j).putExtra("is_search_enabled", true).putExtra("request_key", str);
        }
    }

    /* compiled from: VkFriendsPickerActivity.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Set<? extends UserId>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Set<? extends UserId> set) {
            Set<? extends UserId> set2 = set;
            VkFriendsPickerActivity vkFriendsPickerActivity = (VkFriendsPickerActivity) this.receiver;
            iwu0 iwu0Var = vkFriendsPickerActivity.n;
            if (iwu0Var == null) {
                iwu0Var = null;
            }
            if (!iwu0Var.e) {
                VkFriendsPickerActivity vkFriendsPickerActivity2 = iwu0Var.b;
                Object Z = j5g.Z(set2);
                vkFriendsPickerActivity2.Q1(Z != null ? Collections.singleton(Z) : EmptySet.b);
            }
            if (vkFriendsPickerActivity.k) {
                Toolbar toolbar = vkFriendsPickerActivity.h;
                (toolbar != null ? toolbar : null).setTitle(vkFriendsPickerActivity.O1());
                vkFriendsPickerActivity.R1();
            }
            return s3q0.a;
        }
    }

    public final String O1() {
        String string;
        Bundle extras = getIntent().getExtras();
        String str = "";
        if (extras != null && (string = extras.getString("title", "")) != null) {
            str = string;
        }
        zxv0 zxv0Var = this.o;
        if (zxv0Var == null) {
            zxv0Var = null;
        }
        LinkedHashSet linkedHashSet = zxv0Var.g;
        return !linkedHashSet.isEmpty() ? getResources().getString(R.string.vk_selected_n, Integer.valueOf(linkedHashSet.size())) : str.length() > 0 ? str : this.k ? getString(R.string.vk_select_friends) : getString(R.string.vk_select_friend);
    }

    public final void Q1(Set<UserId> set) {
        Intent intent = new Intent();
        Set<UserId> set2 = set;
        ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserId) it.next()).b));
        }
        intent.putExtra("result_ids", j5g.P0(arrayList));
        intent.putExtra("request_key", this.m);
        setResult(-1, intent);
        finish();
    }

    public final void R1() {
        zxv0 zxv0Var = this.o;
        if (zxv0Var == null) {
            zxv0Var = null;
        }
        boolean isEmpty = zxv0Var.g.isEmpty();
        boolean z = !isEmpty;
        ImageButton imageButton = this.j;
        if (imageButton == null) {
            imageButton = null;
        }
        imageButton.setEnabled(z);
        ImageButton imageButton2 = this.j;
        (imageButton2 != null ? imageButton2 : null).setAlpha(!isEmpty ? 1.0f : 0.4f);
    }

    @Override // com.vk.superapp.core.ui.component.VkSdkActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        tgn0 tgn0Var = e370.x;
        if (tgn0Var == null) {
            tgn0Var = null;
        }
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        setTheme(tgn0Var.c(gfx0Var));
        Window window = getWindow();
        gfx0 gfx0Var2 = e370.b;
        if (gfx0Var2 == null) {
            gfx0Var2 = null;
        }
        gfx0Var2.getClass();
        boolean z = !dhr0.M();
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(z);
        super.onCreate(bundle);
        setContentView(R.layout.vk_friends_list);
        Bundle extras = getIntent().getExtras();
        this.k = extras != null ? extras.getBoolean("isMulti") : false;
        Bundle extras2 = getIntent().getExtras();
        this.l = extras2 != null ? extras2.getLong("appId") : 0L;
        Bundle extras3 = getIntent().getExtras();
        this.m = extras3 != null ? extras3.getString("request_key") : null;
        iwu0 iwu0Var = new iwu0(this, this.l);
        this.n = iwu0Var;
        zxv0 zxv0Var = new zxv0(iwu0Var.g, new b(1, this, VkFriendsPickerActivity.class, "onUsersSelectedChanged", "onUsersSelectedChanged(Ljava/util/Set;)V", 0));
        this.o = zxv0Var;
        iwu0 iwu0Var2 = this.n;
        if (iwu0Var2 == null) {
            iwu0Var2 = null;
        }
        boolean z2 = this.k;
        iwu0Var2.e = z2;
        if (zxv0Var.f != z2) {
            zxv0Var.f = z2;
            zxv0Var.notifyDataSetChanged();
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(O1());
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(krv0.f(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_text_accent_themed, toolbar.getContext()));
        toolbar.setNavigationOnClickListener(new aj6(this, 11));
        toolbar.setNavigationContentDescription(getString(R.string.vk_accessibility_close));
        this.h = toolbar;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) findViewById(R.id.recycler);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        recyclerPaginatedView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        zxv0 zxv0Var2 = this.o;
        if (zxv0Var2 == null) {
            zxv0Var2 = null;
        }
        recyclerPaginatedView.setAdapter(zxv0Var2);
        recyclerPaginatedView.setSwipeRefreshEnabled(true);
        this.f = recyclerPaginatedView;
        BaseVkSearchView baseVkSearchView = (BaseVkSearchView) findViewById(R.id.search_view);
        baseVkSearchView.setHint(baseVkSearchView.getContext().getString(R.string.vk_search_friends));
        baseVkSearchView.setOnBackClickListener(new pyr0(this, 15));
        baseVkSearchView.setMaxInputLength(256);
        baseVkSearchView.setVoiceInputEnabled(true);
        hg1.a(new gzw.a(new qno0(baseVkSearchView.getEditView())).z(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).U(new l960(new jz30(19), 16)).subscribe(new t520(new bjm0(this, 16), 29), new p350(new yaq0(6), 28)), this);
        this.i = baseVkSearchView;
        ImageButton imageButton = (ImageButton) findViewById(R.id.confirm_button);
        this.j = imageButton;
        jjc.g(imageButton, new n3b0(this, 27));
        R1();
        iwu0 iwu0Var3 = this.n;
        if (iwu0Var3 == null) {
            iwu0Var3 = null;
        }
        iwu0Var3.getClass();
        c.h hVar = new c.h(iwu0Var3);
        hVar.i = 50;
        hVar.s = 10;
        VkFriendsPickerActivity vkFriendsPickerActivity = iwu0Var3.b;
        RecyclerPaginatedView recyclerPaginatedView2 = vkFriendsPickerActivity.f;
        vkFriendsPickerActivity.g = f.a(hVar, recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!this.k) {
            return true;
        }
        getMenuInflater().inflate(R.menu.vk_friends_picker, menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        Bundle extras = getIntent().getExtras();
        findItem.setVisible(extras != null ? extras.getBoolean("is_search_enabled", false) : false);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        iwu0 iwu0Var = this.n;
        if (iwu0Var == null) {
            iwu0Var = null;
        }
        iwu0Var.d.dispose();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        Toolbar toolbar = this.h;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setVisibility(4);
        BaseVkSearchView baseVkSearchView = this.i;
        if (baseVkSearchView == null) {
            baseVkSearchView = null;
        }
        baseVkSearchView.setVisibility(0);
        BaseVkSearchView baseVkSearchView2 = this.i;
        (baseVkSearchView2 != null ? baseVkSearchView2 : null).a5();
        return true;
    }
}
