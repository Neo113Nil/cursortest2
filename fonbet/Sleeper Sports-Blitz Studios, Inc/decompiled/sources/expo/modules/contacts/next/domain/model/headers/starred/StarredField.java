package expo.modules.contacts.next.domain.model.headers.starred;

import android.database.Cursor;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StarredField.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/starred/StarredField;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "<init>", "()V", "projection", "", "", "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "extract-349A5c0", "(Landroid/database/Cursor;)I", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StarredField implements ExtractableField.Contacts<Starred> {
    public static final StarredField INSTANCE = new StarredField();
    private static final String[] projection = {Columns.STARRED};

    private StarredField() {
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public /* bridge */ /* synthetic */ Extractable extract(Cursor cursor) {
        return Starred.m11703boximpl(m11710extract349A5c0(cursor));
    }

    @Override // expo.modules.contacts.next.domain.model.ExtractableField
    public String[] getProjection() {
        return projection;
    }

    /* renamed from: extract-349A5c0, reason: not valid java name */
    public int m11710extract349A5c0(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        return Starred.m11704constructorimpl(cursor.getInt(cursor.getColumnIndexOrThrow(Columns.STARRED)));
    }
}
