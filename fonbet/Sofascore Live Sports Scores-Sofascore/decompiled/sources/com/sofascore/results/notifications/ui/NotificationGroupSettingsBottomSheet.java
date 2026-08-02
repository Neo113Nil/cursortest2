package com.sofascore.results.notifications.ui;

import android.os.Bundle;
import com.sofascore.results.notifications.ui.NotificationGroupSettingsBottomSheet;
import defpackage.duf;
import defpackage.jmc;
import defpackage.joa;
import defpackage.llc;
import defpackage.otk;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.wfd;
import defpackage.wxf;
import defpackage.wya;
import defpackage.yfd;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/notifications/ui/NotificationGroupSettingsBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "qea", "Lvnb;", "Lvfd;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationGroupSettingsBottomSheet extends Hilt_NotificationGroupSettingsBottomSheet {
    public final otk C;
    public final boolean D;
    public final joa E;
    public final joa F;

    public NotificationGroupSettingsBottomSheet() {
        jmc jmcVar = new jmc(this, 16);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new jmc(jmcVar, 17));
        this.C = new otk(duf.a.getOrCreateKotlinClass(yfd.class), new llc(a, 19), new wya(19, this, a), new llc(a, 20));
        final int i = 1;
        this.D = true;
        final int i2 = 0;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: ofd
            public final /* synthetic */ NotificationGroupSettingsBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                NotificationGroupSettingsBottomSheet notificationGroupSettingsBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        Bundle arguments = notificationGroupSettingsBottomSheet.getArguments();
                        if (arguments != null) {
                            return arguments.getString("TITLE_EXTRA");
                        }
                        return null;
                    default:
                        Bundle arguments2 = notificationGroupSettingsBottomSheet.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("PRESELECTED_SETTING_EXTRA");
                        }
                        return null;
                }
            }
        });
        this.F = ypa.a(ysaVar, new Function0(this) { // from class: ofd
            public final /* synthetic */ NotificationGroupSettingsBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                NotificationGroupSettingsBottomSheet notificationGroupSettingsBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        Bundle arguments = notificationGroupSettingsBottomSheet.getArguments();
                        if (arguments != null) {
                            return arguments.getString("TITLE_EXTRA");
                        }
                        return null;
                    default:
                        Bundle arguments2 = notificationGroupSettingsBottomSheet.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("PRESELECTED_SETTING_EXTRA");
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(1512198307, new t1d(this, 2), true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = ((yfd) this.C.getValue()).m;
        if (str == null) {
            str = null;
        } else if (str.equals("other")) {
            str = "other_updates";
        } else if (str.equals("user")) {
            str = "gaming";
        }
        this.t.b = str;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        yfd yfdVar = (yfd) this.C.getValue();
        yfdVar.n(null, new wfd(yfdVar, wxf.i(yfdVar.i()), 0));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "NotificationSettingsSelectionModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return (String) this.E.getValue();
    }
}
