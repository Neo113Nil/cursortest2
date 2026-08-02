package expo.modules.contacts.next.mappers.domain.data;

import expo.modules.contacts.next.domain.model.note.operations.AppendableNote;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.note.operations.PatchNote;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NoteMapper.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lexpo/modules/contacts/next/mappers/domain/data/NoteMapper;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "", "<init>", "()V", "toDto", "model", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "newValue", "toUpdatable-bM46d30", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoteMapper implements MutableDataPropertyMapper<ExistingNote, String> {
    public static final NoteMapper INSTANCE = new NoteMapper();

    private NoteMapper() {
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.DataPropertyMapper
    public String toDto(ExistingNote model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model.getNote();
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
    /* renamed from: toUpdatable-bM46d30, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public PatchNote mo11777toUpdatablebM46d30(String dataId, String newValue) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        return new PatchNote(dataId, new ValueOrUndefined.Value(newValue), null);
    }

    @Override // expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper
    /* renamed from: toAppendable-MYK5hZQ, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public AppendableNote mo11776toAppendableMYK5hZQ(String newValue, String rawContactId) {
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableNote(rawContactId, newValue, null);
    }
}
