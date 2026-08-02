package expo.modules.contacts.next.domain.model.note.operations;

import android.content.ContentProviderOperation;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.note.NoteModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppendableNote.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "Lexpo/modules/contacts/next/domain/model/note/NoteModel;", "Lexpo/modules/contacts/next/domain/model/Appendable;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "note", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRawContactId-WW_a-ig", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppendableNote extends NoteModel implements Appendable {
    private final String rawContactId;

    public /* synthetic */ AppendableNote(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @Override // expo.modules.contacts.next.domain.model.Appendable
    public ContentProviderOperation toAppendOperation() {
        return Appendable.DefaultImpls.toAppendOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Appendable
    /* renamed from: getRawContactId-WW_a-ig, reason: from getter */
    public String getRawContactId() {
        return this.rawContactId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AppendableNote(String rawContactId, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        this.rawContactId = rawContactId;
    }
}
