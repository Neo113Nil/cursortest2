package com.vk.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.vk.lists.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import xsna.hg1;
import xsna.hou;
import xsna.myc0;
import xsna.ox0;
import xsna.oz50;
import xsna.r6;
import xsna.tc2;
import xsna.ysg0;

/* compiled from: CommunityGroupedNotificationsFragment.kt */
/* loaded from: classes4.dex */
public final class CommunityGroupedNotificationsFragment extends GroupedNotificationsFragment {
    public static final /* synthetic */ int i0 = 0;
    public long g0;
    public boolean h0 = true;

    /* compiled from: CommunityGroupedNotificationsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunityGroupedNotificationsFragment.kt */
    public static final class b {
        public final long a;

        public b(long j) {
            this.a = j;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2 || i2 != -1) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.g0 = 0L;
            finish();
        }
    }

    @Override // com.vk.notifications.GroupedNotificationsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.g0 = arguments != null ? arguments.getLong("id") : 0L;
        if (bundle != null) {
            this.g0 = bundle.getLong("id");
        }
        f<Object> fVar = ysg0.b.a;
        ox0 ox0Var = new ox0(this, 14);
        fVar.getClass();
        eo(hg1.h(new i0(fVar, ox0Var), new r6(this, 27)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add;
        MenuItem icon;
        MenuItem onMenuItemClickListener;
        menu.clear();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        if (this.g0 <= 0 || !myc0.f(string) || (add = menu.add(R.string.menu_settings)) == null || (icon = add.setIcon(R.drawable.vk_icon_filter_24)) == null || (onMenuItemClickListener = icon.setOnMenuItemClickListener(new tc2(1, this, string))) == null) {
            return;
        }
        onMenuItemClickListener.setShowAsAction(2);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.h0) {
            return;
        }
        hou houVar = this.Z;
        if (houVar != null) {
            houVar.clear();
        }
        c cVar = this.X;
        if (cVar != null) {
            cVar.p(false);
        }
        this.h0 = true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("id", this.g0);
    }
}
