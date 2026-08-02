package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.vk.auth.api.models.AuthResult;
import xsna.dpj0;
import xsna.f5z;
import xsna.idy;
import xsna.ozl;

/* compiled from: ComponentActivity.kt */
/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements f5z, idy.a {
    private final dpj0<Class<? extends a>, a> extraDataMap = new dpj0<>(0);
    private final m lifecycleRegistry = new m(this, true);

    /* compiled from: ComponentActivity.kt */
    @ozl
    /* loaded from: classes11.dex */
    public static class a {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldSkipDump(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (!str.equals("--autofill")) {
                    }
                    break;
            }
            return true;
        }
        return false;
    }

    public void J() {
        onBackPressed();
    }

    public boolean Lj() {
        return isFinishing();
    }

    public void T0() {
        finish();
    }

    public void ad(int i, Intent intent) {
        setResult(i, intent);
    }

    public void close() {
        finish();
    }

    public void destroy() {
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        idy.a();
        return idy.b(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        idy.a();
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @ozl
    public <T extends a> T getExtraData(Class<T> cls) {
        return (T) this.extraDataMap.get(cls);
    }

    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = v.c;
        v.a.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.lifecycleRegistry.e(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @ozl
    public void putExtraData(a aVar) {
        this.extraDataMap.put(a.class, aVar);
    }

    public void r1(AuthResult authResult) {
        finish();
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // xsna.idy.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }
}
