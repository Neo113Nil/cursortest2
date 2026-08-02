package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b4a extends InputConnectionWrapper {
    public final /* synthetic */ c4a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4a(InputConnection inputConnection, c4a c4aVar) {
        super(inputConnection, false);
        this.a = c4aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.e(inputContentInfo == null ? null : new d4a(new j0l(inputContentInfo, 29), 0), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
