package expo.modules.contacts.next.extensions;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
/* synthetic */ class ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1 extends FunctionReferenceImpl implements Function2<Cursor, Integer, String> {
    public static final ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1 INSTANCE = new ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1();

    ContentResolverExtensionsKt$getContactIdFromRawContactId$2$contactIdString$1() {
        super(2, Cursor.class, "getString", "getString(I)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Cursor cursor, Integer num) {
        return invoke(cursor, num.intValue());
    }

    public final String invoke(Cursor p0, int i) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getString(i);
    }
}
