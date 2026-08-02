package com.sofascore.results.profile.editor.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.nq8;
import defpackage.yhk;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/editor/dialog/ProfileEditorMatchOpeningsDescriptionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileEditorMatchOpeningsDescriptionModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_editor_match_openings, (ViewGroup) v().l, false);
        int i = R.id.all_editors_average;
        if (((TextView) nq8.B(R.id.all_editors_average, inflate)) != null) {
            i = R.id.editor_events_dialog_text;
            if (((TextView) nq8.B(R.id.editor_events_dialog_text, inflate)) != null) {
                i = R.id.editor_events_icon;
                if (((ImageView) nq8.B(R.id.editor_events_icon, inflate)) != null) {
                    i = R.id.months;
                    if (((TextView) nq8.B(R.id.months, inflate)) != null) {
                        i = R.id.num_of_event_openings;
                        if (((TextView) nq8.B(R.id.num_of_event_openings, inflate)) != null) {
                            ScrollView scrollView = (ScrollView) inflate;
                            scrollView.getClass();
                            return scrollView;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "MatchViewsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.monthly_match_views);
        string.getClass();
        return string;
    }
}
