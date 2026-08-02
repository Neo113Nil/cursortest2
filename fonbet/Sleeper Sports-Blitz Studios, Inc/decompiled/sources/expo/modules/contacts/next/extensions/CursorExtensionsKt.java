package expo.modules.contacts.next.extensions;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CursorExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "Landroid/database/Cursor;", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CursorExtensionsKt {
    public static final Sequence<Cursor> asSequence(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        return SequencesKt.sequence(new CursorExtensionsKt$asSequence$1(cursor, null));
    }
}
