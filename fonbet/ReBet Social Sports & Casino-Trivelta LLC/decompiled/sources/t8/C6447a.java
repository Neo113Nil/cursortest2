package t8;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.BaseActivityEventListener;
import g6.InterfaceC4350j;

/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6447a extends BaseActivityEventListener {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4350j f65770a = InterfaceC4350j.b.a();

    public InterfaceC4350j a() {
        return this.f65770a;
    }

    @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        this.f65770a.a(i10, i11, intent);
    }
}
