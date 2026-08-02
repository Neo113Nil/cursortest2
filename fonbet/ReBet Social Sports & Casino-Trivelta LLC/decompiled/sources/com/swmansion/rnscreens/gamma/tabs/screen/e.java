package com.swmansion.rnscreens.gamma.tabs.screen;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    public final a f41963m;

    public e(a tabsScreen) {
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        this.f41963m = tabsScreen;
    }

    public final String d0() {
        return this.f41963m.getRequireScreenKey$react_native_screens_release();
    }

    public final a e0() {
        return this.f41963m;
    }

    public final boolean f0() {
        return this.f41963m.getPreventNativeSelection();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.f41963m.c(this, newConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f41963m;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.f41963m.getEventEmitter$react_native_screens_release().a();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f41963m.getEventEmitter$react_native_screens_release().c();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.f41963m.getEventEmitter$react_native_screens_release().d();
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.f41963m.getEventEmitter$react_native_screens_release().b();
        super.onStop();
    }
}
