package l1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.google.firebase.messaging.x;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f19319a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.d f19320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        y8.d dVar = new y8.d();
        this.f19319a = editText;
        this.f19320b = dVar;
        if (j1.j.f18201k != null) {
            j1.j a7 = j1.j.a();
            if (a7.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            com.android.billingclient.api.b bVar = a7.f18206e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            k1.b bVar2 = (k1.b) ((x) bVar.f3971c).f6182a;
            int a10 = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? ((ByteBuffer) bVar2.f1362d).getInt(a10 + bVar2.f1359a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i5, int i10) {
        Editable editableText = this.f19319a.getEditableText();
        this.f19320b.getClass();
        return y8.d.m(this, editableText, i5, i10, false) || super.deleteSurroundingText(i5, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i5, int i10) {
        Editable editableText = this.f19319a.getEditableText();
        this.f19320b.getClass();
        return y8.d.m(this, editableText, i5, i10, true) || super.deleteSurroundingTextInCodePoints(i5, i10);
    }
}
