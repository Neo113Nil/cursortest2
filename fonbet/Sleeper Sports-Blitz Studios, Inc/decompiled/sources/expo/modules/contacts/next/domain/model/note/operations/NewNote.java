package expo.modules.contacts.next.domain.model.note.operations;

import android.content.ContentProviderOperation;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.note.NoteModel;
import kotlin.Metadata;

/* compiled from: NewNote.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lexpo/modules/contacts/next/domain/model/note/operations/NewNote;", "Lexpo/modules/contacts/next/domain/model/note/NoteModel;", "Lexpo/modules/contacts/next/domain/model/Insertable;", "note", "", "<init>", "(Ljava/lang/String;)V", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NewNote extends NoteModel implements Insertable {
    @Override // expo.modules.contacts.next.domain.model.Insertable
    public ContentProviderOperation toInsertOperation() {
        return Insertable.DefaultImpls.toInsertOperation(this);
    }

    public NewNote(String str) {
        super(str);
    }
}
