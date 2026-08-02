package com.vk.search.ui;

import android.app.Activity;
import android.location.Location;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.location.common.LocationCommon;
import com.vk.permission.PermissionHelper;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.concurrent.atomic.AtomicReference;
import xsna.asp;
import xsna.b290;
import xsna.bjc;
import xsna.cp50;
import xsna.dyh0;
import xsna.etb;
import xsna.fo20;
import xsna.gzs;
import xsna.k170;
import xsna.oxz;
import xsna.uzp0;
import xsna.ver0;
import xsna.vnb0;
import xsna.zrp;

/* compiled from: SearchLocationPermissionsController.kt */
/* loaded from: classes5.dex */
public final class SearchLocationPermissionsController {
    public final Activity a;
    public final dyh0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchLocationPermissionsController.kt */
    public static final class PermissionSettingsAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PermissionSettingsAction[] $VALUES;
        public static final PermissionSettingsAction Open;

        static {
            PermissionSettingsAction permissionSettingsAction = new PermissionSettingsAction("Open", 0);
            Open = permissionSettingsAction;
            PermissionSettingsAction[] permissionSettingsActionArr = {permissionSettingsAction};
            $VALUES = permissionSettingsActionArr;
            $ENTRIES = new asp(permissionSettingsActionArr);
        }

        public PermissionSettingsAction() {
            throw null;
        }

        public static PermissionSettingsAction valueOf(String str) {
            return (PermissionSettingsAction) Enum.valueOf(PermissionSettingsAction.class, str);
        }

        public static PermissionSettingsAction[] values() {
            return (PermissionSettingsAction[]) $VALUES.clone();
        }
    }

    /* compiled from: SearchLocationPermissionsController.kt */
    public static final class a {

        /* compiled from: SearchLocationPermissionsController.kt */
        /* renamed from: com.vk.search.ui.SearchLocationPermissionsController$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1775a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PermissionSettingsAction.values().length];
                try {
                    iArr[PermissionSettingsAction.Open.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static void a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, String str) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, str, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }

        public static void b(String str, boolean z, boolean z2, boolean z3) {
            a(z2 ? z3 ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_PRECISE_GEO_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_PRECISE_GEO : z ? z3 ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_BROAD_GEO_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.PROVIDE_BROAD_GEO : z3 ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REJECT_GEO_OUT : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REJECT_GEO, str);
        }
    }

    public SearchLocationPermissionsController(Activity activity, CatalogGetSearchGroupsRequestFactory catalogGetSearchGroupsRequestFactory) {
        this.a = activity;
        this.b = catalogGetSearchGroupsRequestFactory;
        PermissionHelper.a.getClass();
        if (PermissionHelper.b(activity, PermissionHelper.h)) {
            b();
        }
    }

    public final void a(final String str, final gzs gzsVar) {
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        String[] strArr = PermissionHelper.h;
        Activity activity = this.a;
        final boolean b = PermissionHelper.b(activity, strArr);
        String[] strArr2 = PermissionHelper.i;
        final boolean b2 = PermissionHelper.b(activity, strArr2);
        if (b && b2) {
            gzsVar.invoke();
        } else {
            a.a(b ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_PRECISE_USER_GEO : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_USER_GEO, str);
            PermissionHelper.g(permissionHelper, this.a, strArr, strArr2, 0, -1, new gzs() { // from class: xsna.ewh0
                /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
                
                    if (com.vk.permission.PermissionHelper.b(r2, r5) != false) goto L18;
                 */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
                @Override // xsna.gzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    boolean z;
                    LocationCommon locationCommon = LocationCommon.a;
                    SearchLocationPermissionsController searchLocationPermissionsController = SearchLocationPermissionsController.this;
                    Activity activity2 = searchLocationPermissionsController.a;
                    locationCommon.getClass();
                    if (LocationCommon.b(activity2)) {
                        searchLocationPermissionsController.b();
                    } else {
                        AtomicReference<Location> atomicReference = oxz.a;
                        oxz.i(activity2);
                    }
                    boolean z2 = true;
                    if (!b) {
                        PermissionHelper.a.getClass();
                        if (PermissionHelper.b(activity2, PermissionHelper.h)) {
                            z = true;
                            if (!b2) {
                                PermissionHelper permissionHelper2 = PermissionHelper.a;
                                String[] strArr3 = PermissionHelper.i;
                                permissionHelper2.getClass();
                            }
                            z2 = false;
                            if (!z || z2) {
                                SearchLocationPermissionsController.a.b(str, z, z2, false);
                            }
                            gzsVar.invoke();
                            return s3q0.a;
                        }
                    }
                    z = false;
                    if (!b2) {
                    }
                    z2 = false;
                    if (!z) {
                    }
                    SearchLocationPermissionsController.a.b(str, z, z2, false);
                    gzsVar.invoke();
                    return s3q0.a;
                }
            }, new vnb0(1, str, gzsVar), new b290(str, 14), 8);
        }
    }

    public final void b() {
        AtomicReference<Location> atomicReference = oxz.a;
        Activity activity = this.a;
        ver0.b(activity, oxz.c(5000L, activity).subscribe(new cp50(new k170(this, 22), 11), new etb(new fo20(19), 2)));
    }
}
