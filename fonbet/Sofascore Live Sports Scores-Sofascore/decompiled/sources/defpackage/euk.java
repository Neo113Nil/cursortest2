package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class euk extends p9 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ euk(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2.getCount() > 1) goto L14;
     */
    @Override // defpackage.p9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        PagerAdapter pagerAdapter;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                suk sukVar = (suk) obj;
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(suk.class.getName());
                PagerAdapter pagerAdapter2 = sukVar.mAdapter;
                if (pagerAdapter2 != null) {
                    z = true;
                    break;
                }
                z = false;
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (pagerAdapter = sukVar.mAdapter) != null) {
                    accessibilityEvent.setItemCount(pagerAdapter.getCount());
                    accessibilityEvent.setFromIndex(sukVar.mCurItem);
                    accessibilityEvent.setToIndex(sukVar.mCurItem);
                    break;
                }
                break;
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) obj).d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.p9
    public final void d(View view, da daVar) {
        int i = this.d;
        int i2 = -1;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, daVar.a);
                daVar.k(suk.class.getName());
                suk sukVar = (suk) obj;
                PagerAdapter pagerAdapter = sukVar.mAdapter;
                if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                    z = true;
                }
                daVar.q(z);
                if (sukVar.canScrollHorizontally(1)) {
                    daVar.a(4096);
                }
                if (sukVar.canScrollHorizontally(-1)) {
                    daVar.a(8192);
                    break;
                }
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                daVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                if (!((g02) obj).k) {
                    accessibilityNodeInfo2.setDismissable(false);
                    break;
                } else {
                    daVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    accessibilityNodeInfo2.setDismissable(true);
                    break;
                }
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo3.setChecked(checkableImageButton.d);
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, daVar.a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.s;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i2 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i4).getVisibility() != 8) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                daVar.m(dad.w(0, 1, i2, 1, ((MaterialButton) view).u));
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, daVar.a);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                daVar.b(new x9(16, materialCalendar.m.getVisibility() == 0 ? materialCalendar.getString(R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 6:
                AccessibilityNodeInfo accessibilityNodeInfo4 = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo4.setCheckable(navigationMenuItemView.i);
                accessibilityNodeInfo4.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
            case 7:
                b5f b5fVar = (b5f) obj;
                b5fVar.g.d(view, daVar);
                RecyclerView recyclerView = b5fVar.f;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                l adapter = recyclerView.getAdapter();
                if (adapter instanceof y4f) {
                    ((y4f) adapter).q(childAdapterPosition);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = daVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                if (!((cgh) obj).k) {
                    accessibilityNodeInfo5.setDismissable(false);
                    break;
                } else {
                    daVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    accessibilityNodeInfo5.setDismissable(true);
                    break;
                }
        }
    }

    @Override // defpackage.p9
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                suk sukVar = (suk) obj;
                if (!super.g(view, i, bundle)) {
                    if (i == 4096) {
                        if (sukVar.canScrollHorizontally(1)) {
                            sukVar.setCurrentItem(sukVar.mCurItem + 1);
                            break;
                        }
                    } else if (i == 8192 && sukVar.canScrollHorizontally(-1)) {
                        sukVar.setCurrentItem(sukVar.mCurItem - 1);
                        break;
                    }
                }
                break;
            case 1:
                if (i != 1048576) {
                    break;
                } else {
                    ((n71) obj).a();
                    break;
                }
            case 2:
                if (i == 1048576) {
                    g02 g02Var = (g02) obj;
                    if (g02Var.k) {
                        g02Var.cancel();
                        break;
                    }
                }
                break;
            case 8:
                if (i == 1048576) {
                    cgh cghVar = (cgh) obj;
                    if (cghVar.k) {
                        cghVar.cancel();
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }
}
