package expo.modules.contacts.next.extensions;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ContentResolverExtensions.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a8\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0086@¢\u0006\u0002\u0010\t\u001a(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000f\u001a.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0086@¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0082\u0001\u0010\u0019\u001a\u0004\u0018\u0001H\u001a\"\u0004\b\u0000\u0010\u001a*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00062,\u0010\u001c\u001a(\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\u001a0\u001d¢\u0006\u0002\b\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010%\u001aR\u0010&\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"safeDelete", "", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "where", "", "selectionArgs", "", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeApplyBatch", "Landroid/content/ContentProviderResult;", "authority", "operation", "Landroid/content/ContentProviderOperation;", "(Landroid/content/ContentResolver;Ljava/lang/String;Landroid/content/ContentProviderOperation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "operations", "", "(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContactIdFromRawContactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "getContactIdFromRawContactId-5WPtcSs", "(Landroid/content/ContentResolver;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryOne", ExifInterface.GPS_DIRECTION_TRUE, "column", "extractor", "Lkotlin/Function2;", "Landroid/database/Cursor;", "Lkotlin/ParameterName;", "name", "index", "Lkotlin/ExtensionFunctionType;", "selection", SDKConstants.PARAM_SORT_ORDER, "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeQuery", "projection", "(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContentResolverExtensionsKt {
    public static /* synthetic */ Object safeDelete$default(ContentResolver contentResolver, Uri uri, String str, String[] strArr, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            strArr = null;
        }
        return safeDelete(contentResolver, uri, str, strArr, continuation);
    }

    public static final Object safeDelete(ContentResolver contentResolver, Uri uri, String str, String[] strArr, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContentResolverExtensionsKt$safeDelete$2(contentResolver, uri, str, strArr, null), continuation);
    }

    public static final Object safeApplyBatch(ContentResolver contentResolver, String str, ContentProviderOperation contentProviderOperation, Continuation<? super ContentProviderResult[]> continuation) {
        return safeApplyBatch(contentResolver, str, (List<? extends ContentProviderOperation>) CollectionsKt.listOf(contentProviderOperation), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object safeApplyBatch(ContentResolver contentResolver, String str, List<? extends ContentProviderOperation> list, Continuation<? super ContentProviderResult[]> continuation) {
        ContentResolverExtensionsKt$safeApplyBatch$2 contentResolverExtensionsKt$safeApplyBatch$2;
        int i;
        if (continuation instanceof ContentResolverExtensionsKt$safeApplyBatch$2) {
            contentResolverExtensionsKt$safeApplyBatch$2 = (ContentResolverExtensionsKt$safeApplyBatch$2) continuation;
            if ((contentResolverExtensionsKt$safeApplyBatch$2.label & Integer.MIN_VALUE) != 0) {
                contentResolverExtensionsKt$safeApplyBatch$2.label -= Integer.MIN_VALUE;
                Object obj = contentResolverExtensionsKt$safeApplyBatch$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentResolverExtensionsKt$safeApplyBatch$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ContentResolverExtensionsKt$safeApplyBatch$3 contentResolverExtensionsKt$safeApplyBatch$3 = new ContentResolverExtensionsKt$safeApplyBatch$3(contentResolver, str, list, null);
                    contentResolverExtensionsKt$safeApplyBatch$2.label = 1;
                    obj = BuildersKt.withContext(io2, contentResolverExtensionsKt$safeApplyBatch$3, contentResolverExtensionsKt$safeApplyBatch$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        contentResolverExtensionsKt$safeApplyBatch$2 = new ContentResolverExtensionsKt$safeApplyBatch$2(continuation);
        Object obj2 = contentResolverExtensionsKt$safeApplyBatch$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentResolverExtensionsKt$safeApplyBatch$2.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: getContactIdFromRawContactId-5WPtcSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11753getContactIdFromRawContactId5WPtcSs(ContentResolver contentResolver, String str, Continuation<? super ContactId> continuation) {
        ContentResolverExtensionsKt$getContactIdFromRawContactId$1 contentResolverExtensionsKt$getContactIdFromRawContactId$1;
        int i;
        ContactId contactId;
        if (continuation instanceof ContentResolverExtensionsKt$getContactIdFromRawContactId$1) {
            contentResolverExtensionsKt$getContactIdFromRawContactId$1 = (ContentResolverExtensionsKt$getContactIdFromRawContactId$1) continuation;
            if ((contentResolverExtensionsKt$getContactIdFromRawContactId$1.label & Integer.MIN_VALUE) != 0) {
                contentResolverExtensionsKt$getContactIdFromRawContactId$1.label -= Integer.MIN_VALUE;
                Object obj = contentResolverExtensionsKt$getContactIdFromRawContactId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contentResolverExtensionsKt$getContactIdFromRawContactId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    ContentResolverExtensionsKt$getContactIdFromRawContactId$2 contentResolverExtensionsKt$getContactIdFromRawContactId$2 = new ContentResolverExtensionsKt$getContactIdFromRawContactId$2(contentResolver, str, null);
                    contentResolverExtensionsKt$getContactIdFromRawContactId$1.label = 1;
                    obj = BuildersKt.withContext(io2, contentResolverExtensionsKt$getContactIdFromRawContactId$2, contentResolverExtensionsKt$getContactIdFromRawContactId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                contactId = (ContactId) obj;
                if (contactId == null) {
                    return contactId.m11737unboximpl();
                }
                return null;
            }
        }
        contentResolverExtensionsKt$getContactIdFromRawContactId$1 = new ContentResolverExtensionsKt$getContactIdFromRawContactId$1(continuation);
        Object obj2 = contentResolverExtensionsKt$getContactIdFromRawContactId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contentResolverExtensionsKt$getContactIdFromRawContactId$1.label;
        if (i != 0) {
        }
        contactId = (ContactId) obj2;
        if (contactId == null) {
        }
    }

    public static /* synthetic */ Object queryOne$default(ContentResolver contentResolver, Uri uri, String str, Function2 function2, String str2, String[] strArr, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            strArr = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        return queryOne(contentResolver, uri, str, function2, str2, strArr, str3, continuation);
    }

    public static final <T> Object queryOne(ContentResolver contentResolver, Uri uri, String str, Function2<? super Cursor, ? super Integer, ? extends T> function2, String str2, String[] strArr, String str3, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContentResolverExtensionsKt$queryOne$2(str, contentResolver, uri, str2, strArr, str3, function2, null), continuation);
    }

    public static /* synthetic */ Object safeQuery$default(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            strArr2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        return safeQuery(contentResolver, uri, strArr, str, strArr2, str2, continuation);
    }

    public static final Object safeQuery(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Continuation<? super Cursor> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ContentResolverExtensionsKt$safeQuery$2(contentResolver, uri, strArr, str, strArr2, str2, null), continuation);
    }
}
