package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f5863c;

    public /* synthetic */ a(c cVar, View view, int i5) {
        this.f5861a = i5;
        this.f5863c = cVar;
        this.f5862b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        switch (this.f5861a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f5863c).lambda$disableIfTouchExplorationEnabled$0(this.f5862b, z5);
                break;
            default:
                ((HideViewOnScrollBehavior) this.f5863c).lambda$disableIfTouchExplorationEnabled$0(this.f5862b, z5);
                break;
        }
    }
}
