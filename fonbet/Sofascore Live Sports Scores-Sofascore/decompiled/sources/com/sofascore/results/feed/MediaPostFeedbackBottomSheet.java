package com.sofascore.results.feed;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.feed.compose.model.FeedbackType;
import defpackage.a70;
import defpackage.duf;
import defpackage.e7c;
import defpackage.f7c;
import defpackage.gz8;
import defpackage.hv7;
import defpackage.ix7;
import defpackage.joa;
import defpackage.k13;
import defpackage.l6g;
import defpackage.my7;
import defpackage.otk;
import defpackage.rm5;
import defpackage.tc3;
import defpackage.vt2;
import defpackage.wya;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yso;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/feed/MediaPostFeedbackBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "", "Lcom/sofascore/results/feed/compose/model/FeedbackType;", "selectedChips", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaPostFeedbackBottomSheet extends Hilt_MediaPostFeedbackBottomSheet {
    public final boolean B = true;
    public final otk C;

    public MediaPostFeedbackBottomSheet() {
        joa a = ypa.a(ysa.c, new hv7(new f7c(this, 0), 27));
        this.C = new otk(duf.a.getOrCreateKotlinClass(my7.class), new ix7(a, 27), new wya(7, this, a), new ix7(a, 28));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "FEEDBACK_ITEMS", ArrayList.class);
        if (M == null) {
            a70.p("Serializable FEEDBACK_ITEMS not found");
            return null;
        }
        ArrayList<FeedbackType> arrayList = (ArrayList) M;
        FeedbackType feedbackType = (FeedbackType) CollectionsKt.firstOrNull(arrayList);
        this.t.a = feedbackType != null ? Integer.valueOf(feedbackType.c) : null;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        for (FeedbackType feedbackType2 : arrayList) {
            String string = getString(feedbackType2.b, feedbackType2.a);
            string.getClass();
            arrayList2.add(new vt2(feedbackType2, string, false, null, null, null, null, 252));
        }
        return yso.s(this, new tc3(-660957344, new e7c(this, l6g.W(arrayList2), 0), true));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        ((my7) this.C.getValue()).g.l(rm5.a);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FeedFeedbackModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getB() {
        return this.B;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.feed_not_interested_title);
        string.getClass();
        return string;
    }
}
