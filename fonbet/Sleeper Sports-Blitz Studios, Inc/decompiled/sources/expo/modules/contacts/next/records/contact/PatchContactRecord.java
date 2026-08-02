package expo.modules.contacts.next.records.contact;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PatchContactRecord.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u0003\u0012\"\b\u0002\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003J#\u0010i\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010j\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010k\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010l\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010m\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J#\u0010o\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u0003HÆ\u0003J\u0091\u0004\u0010p\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\"\b\u0002\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u00032\"\b\u0002\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u0003HÆ\u0001J\u0013\u0010q\u001a\u00020\u00042\b\u0010r\u001a\u0004\u0018\u00010sHÖ\u0003J\t\u0010t\u001a\u00020uHÖ\u0001J\t\u0010v\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010.\u001a\u0004\b\u0002\u0010/R$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010.\u001a\u0004\b1\u0010/R$\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010.\u001a\u0004\b3\u0010/R$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010.\u001a\u0004\b5\u0010/R$\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010.\u001a\u0004\b7\u0010/R$\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010.\u001a\u0004\b9\u0010/R$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010.\u001a\u0004\b;\u0010/R$\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010.\u001a\u0004\b=\u0010/R$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010.\u001a\u0004\b?\u0010/R$\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010.\u001a\u0004\bA\u0010/R$\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010.\u001a\u0004\bC\u0010/R$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010.\u001a\u0004\bE\u0010/R$\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010.\u001a\u0004\bG\u0010/R$\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010.\u001a\u0004\bI\u0010/R$\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010.\u001a\u0004\bK\u0010/R6\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010.\u001a\u0004\bM\u0010/R6\u0010\u0019\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010.\u001a\u0004\bO\u0010/R6\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bP\u0010.\u001a\u0004\bQ\u0010/R6\u0010\u001f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bR\u0010.\u001a\u0004\bS\u0010/R6\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u0010.\u001a\u0004\bU\u0010/R6\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010.\u001a\u0004\bW\u0010/R6\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u0016\u0018\u00010\u00150\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010.\u001a\u0004\bY\u0010/¨\u0006w"}, d2 = {"Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "Lexpo/modules/kotlin/records/Record;", "isFavourite", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "", "givenName", "", "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "company", "department", "jobTitle", "phoneticCompanyName", "note", "image", "emails", "", "Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "phones", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "dates", "Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "addresses", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "relations", "Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "urlAddresses", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "extraNames", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Patch;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "<init>", "(Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;)V", "isFavourite$annotations", "()V", "()Lexpo/modules/kotlin/types/ValueOrUndefined;", "getGivenName$annotations", "getGivenName", "getMiddleName$annotations", "getMiddleName", "getFamilyName$annotations", "getFamilyName", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "getPhoneticGivenName$annotations", "getPhoneticGivenName", "getPhoneticMiddleName$annotations", "getPhoneticMiddleName", "getPhoneticFamilyName$annotations", "getPhoneticFamilyName", "getCompany$annotations", "getCompany", "getDepartment$annotations", "getDepartment", "getJobTitle$annotations", "getJobTitle", "getPhoneticCompanyName$annotations", "getPhoneticCompanyName", "getNote$annotations", "getNote", "getImage$annotations", "getImage", "getEmails$annotations", "getEmails", "getPhones$annotations", "getPhones", "getDates$annotations", "getDates", "getAddresses$annotations", "getAddresses", "getRelations$annotations", "getRelations", "getUrlAddresses$annotations", "getUrlAddresses", "getExtraNames$annotations", "getExtraNames", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PatchContactRecord implements Record {
    private final ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses;
    private final ValueOrUndefined<String> company;
    private final ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates;
    private final ValueOrUndefined<String> department;
    private final ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails;
    private final ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames;
    private final ValueOrUndefined<String> familyName;
    private final ValueOrUndefined<String> givenName;
    private final ValueOrUndefined<String> image;
    private final ValueOrUndefined<Boolean> isFavourite;
    private final ValueOrUndefined<String> jobTitle;
    private final ValueOrUndefined<String> middleName;
    private final ValueOrUndefined<String> note;
    private final ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones;
    private final ValueOrUndefined<String> phoneticCompanyName;
    private final ValueOrUndefined<String> phoneticFamilyName;
    private final ValueOrUndefined<String> phoneticGivenName;
    private final ValueOrUndefined<String> phoneticMiddleName;
    private final ValueOrUndefined<String> prefix;
    private final ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations;
    private final ValueOrUndefined<String> suffix;
    private final ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses;

    public PatchContactRecord() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ PatchContactRecord copy$default(PatchContactRecord patchContactRecord, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, ValueOrUndefined valueOrUndefined7, ValueOrUndefined valueOrUndefined8, ValueOrUndefined valueOrUndefined9, ValueOrUndefined valueOrUndefined10, ValueOrUndefined valueOrUndefined11, ValueOrUndefined valueOrUndefined12, ValueOrUndefined valueOrUndefined13, ValueOrUndefined valueOrUndefined14, ValueOrUndefined valueOrUndefined15, ValueOrUndefined valueOrUndefined16, ValueOrUndefined valueOrUndefined17, ValueOrUndefined valueOrUndefined18, ValueOrUndefined valueOrUndefined19, ValueOrUndefined valueOrUndefined20, ValueOrUndefined valueOrUndefined21, ValueOrUndefined valueOrUndefined22, int i, Object obj) {
        ValueOrUndefined valueOrUndefined23;
        ValueOrUndefined valueOrUndefined24;
        ValueOrUndefined valueOrUndefined25 = (i & 1) != 0 ? patchContactRecord.isFavourite : valueOrUndefined;
        ValueOrUndefined valueOrUndefined26 = (i & 2) != 0 ? patchContactRecord.givenName : valueOrUndefined2;
        ValueOrUndefined valueOrUndefined27 = (i & 4) != 0 ? patchContactRecord.middleName : valueOrUndefined3;
        ValueOrUndefined valueOrUndefined28 = (i & 8) != 0 ? patchContactRecord.familyName : valueOrUndefined4;
        ValueOrUndefined valueOrUndefined29 = (i & 16) != 0 ? patchContactRecord.prefix : valueOrUndefined5;
        ValueOrUndefined valueOrUndefined30 = (i & 32) != 0 ? patchContactRecord.suffix : valueOrUndefined6;
        ValueOrUndefined valueOrUndefined31 = (i & 64) != 0 ? patchContactRecord.phoneticGivenName : valueOrUndefined7;
        ValueOrUndefined valueOrUndefined32 = (i & 128) != 0 ? patchContactRecord.phoneticMiddleName : valueOrUndefined8;
        ValueOrUndefined valueOrUndefined33 = (i & 256) != 0 ? patchContactRecord.phoneticFamilyName : valueOrUndefined9;
        ValueOrUndefined valueOrUndefined34 = (i & 512) != 0 ? patchContactRecord.company : valueOrUndefined10;
        ValueOrUndefined valueOrUndefined35 = (i & 1024) != 0 ? patchContactRecord.department : valueOrUndefined11;
        ValueOrUndefined valueOrUndefined36 = (i & 2048) != 0 ? patchContactRecord.jobTitle : valueOrUndefined12;
        ValueOrUndefined valueOrUndefined37 = (i & 4096) != 0 ? patchContactRecord.phoneticCompanyName : valueOrUndefined13;
        ValueOrUndefined valueOrUndefined38 = (i & 8192) != 0 ? patchContactRecord.note : valueOrUndefined14;
        ValueOrUndefined valueOrUndefined39 = valueOrUndefined25;
        ValueOrUndefined valueOrUndefined40 = (i & 16384) != 0 ? patchContactRecord.image : valueOrUndefined15;
        ValueOrUndefined valueOrUndefined41 = (i & 32768) != 0 ? patchContactRecord.emails : valueOrUndefined16;
        ValueOrUndefined valueOrUndefined42 = (i & 65536) != 0 ? patchContactRecord.phones : valueOrUndefined17;
        ValueOrUndefined valueOrUndefined43 = (i & 131072) != 0 ? patchContactRecord.dates : valueOrUndefined18;
        ValueOrUndefined valueOrUndefined44 = (i & 262144) != 0 ? patchContactRecord.addresses : valueOrUndefined19;
        ValueOrUndefined valueOrUndefined45 = (i & 524288) != 0 ? patchContactRecord.relations : valueOrUndefined20;
        ValueOrUndefined valueOrUndefined46 = (i & 1048576) != 0 ? patchContactRecord.urlAddresses : valueOrUndefined21;
        if ((i & 2097152) != 0) {
            valueOrUndefined24 = valueOrUndefined46;
            valueOrUndefined23 = patchContactRecord.extraNames;
        } else {
            valueOrUndefined23 = valueOrUndefined22;
            valueOrUndefined24 = valueOrUndefined46;
        }
        return patchContactRecord.copy(valueOrUndefined39, valueOrUndefined26, valueOrUndefined27, valueOrUndefined28, valueOrUndefined29, valueOrUndefined30, valueOrUndefined31, valueOrUndefined32, valueOrUndefined33, valueOrUndefined34, valueOrUndefined35, valueOrUndefined36, valueOrUndefined37, valueOrUndefined38, valueOrUndefined40, valueOrUndefined41, valueOrUndefined42, valueOrUndefined43, valueOrUndefined44, valueOrUndefined45, valueOrUndefined24, valueOrUndefined23);
    }

    @Field
    public static /* synthetic */ void getAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void getCompany$annotations() {
    }

    @Field
    public static /* synthetic */ void getDates$annotations() {
    }

    @Field
    public static /* synthetic */ void getDepartment$annotations() {
    }

    @Field
    public static /* synthetic */ void getEmails$annotations() {
    }

    @Field
    public static /* synthetic */ void getExtraNames$annotations() {
    }

    @Field
    public static /* synthetic */ void getFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getImage$annotations() {
    }

    @Field
    public static /* synthetic */ void getJobTitle$annotations() {
    }

    @Field
    public static /* synthetic */ void getMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getNote$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhones$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticCompanyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPrefix$annotations() {
    }

    @Field
    public static /* synthetic */ void getRelations$annotations() {
    }

    @Field
    public static /* synthetic */ void getSuffix$annotations() {
    }

    @Field
    public static /* synthetic */ void getUrlAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void isFavourite$annotations() {
    }

    public final ValueOrUndefined<Boolean> component1() {
        return this.isFavourite;
    }

    public final ValueOrUndefined<String> component10() {
        return this.company;
    }

    public final ValueOrUndefined<String> component11() {
        return this.department;
    }

    public final ValueOrUndefined<String> component12() {
        return this.jobTitle;
    }

    public final ValueOrUndefined<String> component13() {
        return this.phoneticCompanyName;
    }

    public final ValueOrUndefined<String> component14() {
        return this.note;
    }

    public final ValueOrUndefined<String> component15() {
        return this.image;
    }

    public final ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> component16() {
        return this.emails;
    }

    public final ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> component17() {
        return this.phones;
    }

    public final ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> component18() {
        return this.dates;
    }

    public final ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> component19() {
        return this.addresses;
    }

    public final ValueOrUndefined<String> component2() {
        return this.givenName;
    }

    public final ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> component20() {
        return this.relations;
    }

    public final ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> component21() {
        return this.urlAddresses;
    }

    public final ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> component22() {
        return this.extraNames;
    }

    public final ValueOrUndefined<String> component3() {
        return this.middleName;
    }

    public final ValueOrUndefined<String> component4() {
        return this.familyName;
    }

    public final ValueOrUndefined<String> component5() {
        return this.prefix;
    }

    public final ValueOrUndefined<String> component6() {
        return this.suffix;
    }

    public final ValueOrUndefined<String> component7() {
        return this.phoneticGivenName;
    }

    public final ValueOrUndefined<String> component8() {
        return this.phoneticMiddleName;
    }

    public final ValueOrUndefined<String> component9() {
        return this.phoneticFamilyName;
    }

    public final PatchContactRecord copy(ValueOrUndefined<Boolean> isFavourite, ValueOrUndefined<String> givenName, ValueOrUndefined<String> middleName, ValueOrUndefined<String> familyName, ValueOrUndefined<String> prefix, ValueOrUndefined<String> suffix, ValueOrUndefined<String> phoneticGivenName, ValueOrUndefined<String> phoneticMiddleName, ValueOrUndefined<String> phoneticFamilyName, ValueOrUndefined<String> company, ValueOrUndefined<String> department, ValueOrUndefined<String> jobTitle, ValueOrUndefined<String> phoneticCompanyName, ValueOrUndefined<String> note, ValueOrUndefined<String> image, ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails, ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones, ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates, ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses, ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations, ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses, ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames) {
        Intrinsics.checkNotNullParameter(isFavourite, "isFavourite");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(phoneticGivenName, "phoneticGivenName");
        Intrinsics.checkNotNullParameter(phoneticMiddleName, "phoneticMiddleName");
        Intrinsics.checkNotNullParameter(phoneticFamilyName, "phoneticFamilyName");
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(department, "department");
        Intrinsics.checkNotNullParameter(jobTitle, "jobTitle");
        Intrinsics.checkNotNullParameter(phoneticCompanyName, "phoneticCompanyName");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(phones, "phones");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(relations, "relations");
        Intrinsics.checkNotNullParameter(urlAddresses, "urlAddresses");
        Intrinsics.checkNotNullParameter(extraNames, "extraNames");
        return new PatchContactRecord(isFavourite, givenName, middleName, familyName, prefix, suffix, phoneticGivenName, phoneticMiddleName, phoneticFamilyName, company, department, jobTitle, phoneticCompanyName, note, image, emails, phones, dates, addresses, relations, urlAddresses, extraNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PatchContactRecord)) {
            return false;
        }
        PatchContactRecord patchContactRecord = (PatchContactRecord) other;
        return Intrinsics.areEqual(this.isFavourite, patchContactRecord.isFavourite) && Intrinsics.areEqual(this.givenName, patchContactRecord.givenName) && Intrinsics.areEqual(this.middleName, patchContactRecord.middleName) && Intrinsics.areEqual(this.familyName, patchContactRecord.familyName) && Intrinsics.areEqual(this.prefix, patchContactRecord.prefix) && Intrinsics.areEqual(this.suffix, patchContactRecord.suffix) && Intrinsics.areEqual(this.phoneticGivenName, patchContactRecord.phoneticGivenName) && Intrinsics.areEqual(this.phoneticMiddleName, patchContactRecord.phoneticMiddleName) && Intrinsics.areEqual(this.phoneticFamilyName, patchContactRecord.phoneticFamilyName) && Intrinsics.areEqual(this.company, patchContactRecord.company) && Intrinsics.areEqual(this.department, patchContactRecord.department) && Intrinsics.areEqual(this.jobTitle, patchContactRecord.jobTitle) && Intrinsics.areEqual(this.phoneticCompanyName, patchContactRecord.phoneticCompanyName) && Intrinsics.areEqual(this.note, patchContactRecord.note) && Intrinsics.areEqual(this.image, patchContactRecord.image) && Intrinsics.areEqual(this.emails, patchContactRecord.emails) && Intrinsics.areEqual(this.phones, patchContactRecord.phones) && Intrinsics.areEqual(this.dates, patchContactRecord.dates) && Intrinsics.areEqual(this.addresses, patchContactRecord.addresses) && Intrinsics.areEqual(this.relations, patchContactRecord.relations) && Intrinsics.areEqual(this.urlAddresses, patchContactRecord.urlAddresses) && Intrinsics.areEqual(this.extraNames, patchContactRecord.extraNames);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.isFavourite.hashCode() * 31) + this.givenName.hashCode()) * 31) + this.middleName.hashCode()) * 31) + this.familyName.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.suffix.hashCode()) * 31) + this.phoneticGivenName.hashCode()) * 31) + this.phoneticMiddleName.hashCode()) * 31) + this.phoneticFamilyName.hashCode()) * 31) + this.company.hashCode()) * 31) + this.department.hashCode()) * 31) + this.jobTitle.hashCode()) * 31) + this.phoneticCompanyName.hashCode()) * 31) + this.note.hashCode()) * 31) + this.image.hashCode()) * 31) + this.emails.hashCode()) * 31) + this.phones.hashCode()) * 31) + this.dates.hashCode()) * 31) + this.addresses.hashCode()) * 31) + this.relations.hashCode()) * 31) + this.urlAddresses.hashCode()) * 31) + this.extraNames.hashCode();
    }

    public String toString() {
        return "PatchContactRecord(isFavourite=" + this.isFavourite + ", givenName=" + this.givenName + ", middleName=" + this.middleName + ", familyName=" + this.familyName + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", phoneticGivenName=" + this.phoneticGivenName + ", phoneticMiddleName=" + this.phoneticMiddleName + ", phoneticFamilyName=" + this.phoneticFamilyName + ", company=" + this.company + ", department=" + this.department + ", jobTitle=" + this.jobTitle + ", phoneticCompanyName=" + this.phoneticCompanyName + ", note=" + this.note + ", image=" + this.image + ", emails=" + this.emails + ", phones=" + this.phones + ", dates=" + this.dates + ", addresses=" + this.addresses + ", relations=" + this.relations + ", urlAddresses=" + this.urlAddresses + ", extraNames=" + this.extraNames + ")";
    }

    public PatchContactRecord(ValueOrUndefined<Boolean> isFavourite, ValueOrUndefined<String> givenName, ValueOrUndefined<String> middleName, ValueOrUndefined<String> familyName, ValueOrUndefined<String> prefix, ValueOrUndefined<String> suffix, ValueOrUndefined<String> phoneticGivenName, ValueOrUndefined<String> phoneticMiddleName, ValueOrUndefined<String> phoneticFamilyName, ValueOrUndefined<String> company, ValueOrUndefined<String> department, ValueOrUndefined<String> jobTitle, ValueOrUndefined<String> phoneticCompanyName, ValueOrUndefined<String> note, ValueOrUndefined<String> image, ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails, ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones, ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates, ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses, ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations, ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses, ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames) {
        Intrinsics.checkNotNullParameter(isFavourite, "isFavourite");
        Intrinsics.checkNotNullParameter(givenName, "givenName");
        Intrinsics.checkNotNullParameter(middleName, "middleName");
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(phoneticGivenName, "phoneticGivenName");
        Intrinsics.checkNotNullParameter(phoneticMiddleName, "phoneticMiddleName");
        Intrinsics.checkNotNullParameter(phoneticFamilyName, "phoneticFamilyName");
        Intrinsics.checkNotNullParameter(company, "company");
        Intrinsics.checkNotNullParameter(department, "department");
        Intrinsics.checkNotNullParameter(jobTitle, "jobTitle");
        Intrinsics.checkNotNullParameter(phoneticCompanyName, "phoneticCompanyName");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(phones, "phones");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        Intrinsics.checkNotNullParameter(relations, "relations");
        Intrinsics.checkNotNullParameter(urlAddresses, "urlAddresses");
        Intrinsics.checkNotNullParameter(extraNames, "extraNames");
        this.isFavourite = isFavourite;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.prefix = prefix;
        this.suffix = suffix;
        this.phoneticGivenName = phoneticGivenName;
        this.phoneticMiddleName = phoneticMiddleName;
        this.phoneticFamilyName = phoneticFamilyName;
        this.company = company;
        this.department = department;
        this.jobTitle = jobTitle;
        this.phoneticCompanyName = phoneticCompanyName;
        this.note = note;
        this.image = image;
        this.emails = emails;
        this.phones = phones;
        this.dates = dates;
        this.addresses = addresses;
        this.relations = relations;
        this.urlAddresses = urlAddresses;
        this.extraNames = extraNames;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PatchContactRecord(ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, ValueOrUndefined valueOrUndefined3, ValueOrUndefined valueOrUndefined4, ValueOrUndefined valueOrUndefined5, ValueOrUndefined valueOrUndefined6, ValueOrUndefined valueOrUndefined7, ValueOrUndefined valueOrUndefined8, ValueOrUndefined valueOrUndefined9, ValueOrUndefined valueOrUndefined10, ValueOrUndefined valueOrUndefined11, ValueOrUndefined valueOrUndefined12, ValueOrUndefined valueOrUndefined13, ValueOrUndefined valueOrUndefined14, ValueOrUndefined valueOrUndefined15, ValueOrUndefined valueOrUndefined16, ValueOrUndefined valueOrUndefined17, ValueOrUndefined valueOrUndefined18, ValueOrUndefined valueOrUndefined19, ValueOrUndefined valueOrUndefined20, ValueOrUndefined valueOrUndefined21, ValueOrUndefined valueOrUndefined22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r1, r19, r35, r36, r37, r38, r39, r40);
        ValueOrUndefined.Undefined undefined;
        ValueOrUndefined.Undefined undefined2;
        ValueOrUndefined.Undefined undefined3;
        ValueOrUndefined.Undefined undefined4;
        ValueOrUndefined.Undefined undefined5;
        ValueOrUndefined.Undefined undefined6;
        ValueOrUndefined.Undefined undefined7;
        ValueOrUndefined.Undefined undefined8;
        ValueOrUndefined.Undefined undefined9;
        ValueOrUndefined.Undefined undefined10;
        ValueOrUndefined.Undefined undefined11;
        ValueOrUndefined.Undefined undefined12;
        ValueOrUndefined.Undefined undefined13;
        ValueOrUndefined.Undefined undefined14;
        ValueOrUndefined.Undefined undefined15;
        ValueOrUndefined.Undefined undefined16;
        ValueOrUndefined valueOrUndefined23;
        ValueOrUndefined.Undefined undefined17;
        ValueOrUndefined valueOrUndefined24;
        ValueOrUndefined.Undefined undefined18;
        ValueOrUndefined valueOrUndefined25;
        ValueOrUndefined.Undefined undefined19;
        ValueOrUndefined valueOrUndefined26;
        ValueOrUndefined.Undefined undefined20;
        ValueOrUndefined valueOrUndefined27;
        ValueOrUndefined.Undefined undefined21;
        ValueOrUndefined valueOrUndefined28;
        ValueOrUndefined valueOrUndefined29;
        if ((i & 1) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined22 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined22, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined = undefined22;
        } else {
            undefined = valueOrUndefined;
        }
        if ((i & 2) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined23 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined23, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined2 = undefined23;
        } else {
            undefined2 = valueOrUndefined2;
        }
        if ((i & 4) != 0) {
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined24 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined24, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined3 = undefined24;
        } else {
            undefined3 = valueOrUndefined3;
        }
        if ((i & 8) != 0) {
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined25 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined25, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined4 = undefined25;
        } else {
            undefined4 = valueOrUndefined4;
        }
        if ((i & 16) != 0) {
            ValueOrUndefined.Companion companion5 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined26 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined26, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined5 = undefined26;
        } else {
            undefined5 = valueOrUndefined5;
        }
        if ((i & 32) != 0) {
            ValueOrUndefined.Companion companion6 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined27 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined27, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined6 = undefined27;
        } else {
            undefined6 = valueOrUndefined6;
        }
        if ((i & 64) != 0) {
            ValueOrUndefined.Companion companion7 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined28 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined28, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined7 = undefined28;
        } else {
            undefined7 = valueOrUndefined7;
        }
        if ((i & 128) != 0) {
            ValueOrUndefined.Companion companion8 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined29 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined29, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined8 = undefined29;
        } else {
            undefined8 = valueOrUndefined8;
        }
        if ((i & 256) != 0) {
            ValueOrUndefined.Companion companion9 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined30 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined30, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined9 = undefined30;
        } else {
            undefined9 = valueOrUndefined9;
        }
        if ((i & 512) != 0) {
            ValueOrUndefined.Companion companion10 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined31 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined31, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined10 = undefined31;
        } else {
            undefined10 = valueOrUndefined10;
        }
        if ((i & 1024) != 0) {
            ValueOrUndefined.Companion companion11 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined32 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined32, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined11 = undefined32;
        } else {
            undefined11 = valueOrUndefined11;
        }
        if ((i & 2048) != 0) {
            ValueOrUndefined.Companion companion12 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined33 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined33, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined12 = undefined33;
        } else {
            undefined12 = valueOrUndefined12;
        }
        if ((i & 4096) != 0) {
            ValueOrUndefined.Companion companion13 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined34 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined34, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined13 = undefined34;
        } else {
            undefined13 = valueOrUndefined13;
        }
        if ((i & 8192) != 0) {
            ValueOrUndefined.Companion companion14 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined35 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined35, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined14 = undefined35;
        } else {
            undefined14 = valueOrUndefined14;
        }
        ValueOrUndefined valueOrUndefined30 = undefined;
        if ((i & 16384) != 0) {
            ValueOrUndefined.Companion companion15 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined36 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined36, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined15 = undefined36;
        } else {
            undefined15 = valueOrUndefined15;
        }
        if ((i & 32768) != 0) {
            ValueOrUndefined.Companion companion16 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined37 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined37, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined16 = undefined37;
        } else {
            undefined16 = valueOrUndefined16;
        }
        if ((i & 65536) != 0) {
            ValueOrUndefined.Companion companion17 = ValueOrUndefined.INSTANCE;
            valueOrUndefined23 = undefined16;
            ValueOrUndefined.Undefined undefined38 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined38, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined17 = undefined38;
        } else {
            valueOrUndefined23 = undefined16;
            undefined17 = valueOrUndefined17;
        }
        if ((i & 131072) != 0) {
            ValueOrUndefined.Companion companion18 = ValueOrUndefined.INSTANCE;
            valueOrUndefined24 = undefined17;
            ValueOrUndefined.Undefined undefined39 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined39, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined18 = undefined39;
        } else {
            valueOrUndefined24 = undefined17;
            undefined18 = valueOrUndefined18;
        }
        if ((i & 262144) != 0) {
            ValueOrUndefined.Companion companion19 = ValueOrUndefined.INSTANCE;
            valueOrUndefined25 = undefined18;
            ValueOrUndefined.Undefined undefined40 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined40, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined19 = undefined40;
        } else {
            valueOrUndefined25 = undefined18;
            undefined19 = valueOrUndefined19;
        }
        if ((i & 524288) != 0) {
            ValueOrUndefined.Companion companion20 = ValueOrUndefined.INSTANCE;
            valueOrUndefined26 = undefined19;
            ValueOrUndefined.Undefined undefined41 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined41, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined20 = undefined41;
        } else {
            valueOrUndefined26 = undefined19;
            undefined20 = valueOrUndefined20;
        }
        if ((i & 1048576) != 0) {
            ValueOrUndefined.Companion companion21 = ValueOrUndefined.INSTANCE;
            valueOrUndefined27 = undefined20;
            ValueOrUndefined.Undefined undefined42 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined42, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined21 = undefined42;
        } else {
            valueOrUndefined27 = undefined20;
            undefined21 = valueOrUndefined21;
        }
        if ((i & 2097152) != 0) {
            ValueOrUndefined.Companion companion22 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined valueOrUndefined31 = undefined21;
            ValueOrUndefined.Undefined undefined43 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined43, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined29 = valueOrUndefined31;
            valueOrUndefined28 = undefined43;
        } else {
            valueOrUndefined28 = valueOrUndefined22;
            valueOrUndefined29 = undefined21;
        }
        ValueOrUndefined valueOrUndefined32 = valueOrUndefined24;
        ValueOrUndefined valueOrUndefined33 = valueOrUndefined25;
        ValueOrUndefined valueOrUndefined34 = valueOrUndefined26;
        ValueOrUndefined valueOrUndefined35 = valueOrUndefined27;
        ValueOrUndefined valueOrUndefined36 = undefined2;
        ValueOrUndefined valueOrUndefined37 = undefined3;
        ValueOrUndefined valueOrUndefined38 = undefined4;
        ValueOrUndefined valueOrUndefined39 = undefined5;
        ValueOrUndefined valueOrUndefined40 = undefined6;
        ValueOrUndefined valueOrUndefined41 = undefined7;
        ValueOrUndefined valueOrUndefined42 = undefined8;
        ValueOrUndefined valueOrUndefined43 = undefined9;
        ValueOrUndefined valueOrUndefined44 = undefined10;
        ValueOrUndefined valueOrUndefined45 = undefined11;
        ValueOrUndefined valueOrUndefined46 = undefined12;
        ValueOrUndefined valueOrUndefined47 = undefined13;
        ValueOrUndefined valueOrUndefined48 = undefined14;
    }

    public final ValueOrUndefined<Boolean> isFavourite() {
        return this.isFavourite;
    }

    public final ValueOrUndefined<String> getGivenName() {
        return this.givenName;
    }

    public final ValueOrUndefined<String> getMiddleName() {
        return this.middleName;
    }

    public final ValueOrUndefined<String> getFamilyName() {
        return this.familyName;
    }

    public final ValueOrUndefined<String> getPrefix() {
        return this.prefix;
    }

    public final ValueOrUndefined<String> getSuffix() {
        return this.suffix;
    }

    public final ValueOrUndefined<String> getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final ValueOrUndefined<String> getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final ValueOrUndefined<String> getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final ValueOrUndefined<String> getCompany() {
        return this.company;
    }

    public final ValueOrUndefined<String> getDepartment() {
        return this.department;
    }

    public final ValueOrUndefined<String> getJobTitle() {
        return this.jobTitle;
    }

    public final ValueOrUndefined<String> getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    public final ValueOrUndefined<String> getNote() {
        return this.note;
    }

    public final ValueOrUndefined<String> getImage() {
        return this.image;
    }

    public final ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> getEmails() {
        return this.emails;
    }

    public final ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> getPhones() {
        return this.phones;
    }

    public final ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> getDates() {
        return this.dates;
    }

    public final ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> getAddresses() {
        return this.addresses;
    }

    public final ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> getRelations() {
        return this.relations;
    }

    public final ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> getUrlAddresses() {
        return this.urlAddresses;
    }

    public final ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> getExtraNames() {
        return this.extraNames;
    }
}
