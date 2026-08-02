package com.sofascore.results.chat.addcountry;

import android.os.Bundle;
import com.sofascore.results.R;
import defpackage.br2;
import defpackage.duf;
import defpackage.fcp;
import defpackage.joa;
import defpackage.otk;
import defpackage.t21;
import defpackage.tc3;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/chat/addcountry/ChatCountryFlagBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatCountryFlagBottomSheet extends Hilt_ChatCountryFlagBottomSheet {
    public final otk C;
    public final tc3 D;
    public final tc3 E;

    public ChatCountryFlagBottomSheet() {
        joa a = ypa.a(ysa.c, new w1(new w1(this, 23), 24));
        this.C = new otk(duf.a.getOrCreateKotlinClass(br2.class), new x1(a, 17), new y1(15, this, a), new x1(a, 18));
        this.D = fcp.a;
        this.E = new tc3(-201520566, new t21(this, 28), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getY() {
        return this.E;
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return this.D;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n(0, R.style.ResizableBottomSheetDialog);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FlagsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
