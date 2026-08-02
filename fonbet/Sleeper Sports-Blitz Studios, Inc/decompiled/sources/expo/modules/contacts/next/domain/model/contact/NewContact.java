package expo.modules.contacts.next.domain.model.contact;

import android.content.ContentProviderOperation;
import android.provider.ContactsContract;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Insertable;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewContact.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u0005J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lexpo/modules/contacts/next/domain/model/contact/NewContact;", "", Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "modelsToInsert", "", "Lexpo/modules/contacts/next/domain/model/Insertable;", "<init>", "(ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStarred-NmMWud4", "()I", "I", "getModelsToInsert", "()Ljava/util/List;", "toInsertOperations", "Landroid/content/ContentProviderOperation;", "Lkotlin/jvm/internal/EnhancedNullability;", "component1", "component1-NmMWud4", "component2", "copy", "copy-CCdV_P0", "(ILjava/util/List;)Lexpo/modules/contacts/next/domain/model/contact/NewContact;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NewContact {
    private final List<Insertable> modelsToInsert;
    private final int starred;

    public /* synthetic */ NewContact(int i, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-CCdV_P0$default, reason: not valid java name */
    public static /* synthetic */ NewContact m11673copyCCdV_P0$default(NewContact newContact, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = newContact.starred;
        }
        if ((i2 & 2) != 0) {
            list = newContact.modelsToInsert;
        }
        return newContact.m11675copyCCdV_P0(i, list);
    }

    /* renamed from: component1-NmMWud4, reason: not valid java name and from getter */
    public final int getStarred() {
        return this.starred;
    }

    public final List<Insertable> component2() {
        return this.modelsToInsert;
    }

    /* renamed from: copy-CCdV_P0, reason: not valid java name */
    public final NewContact m11675copyCCdV_P0(int starred, List<? extends Insertable> modelsToInsert) {
        Intrinsics.checkNotNullParameter(modelsToInsert, "modelsToInsert");
        return new NewContact(starred, modelsToInsert, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewContact)) {
            return false;
        }
        NewContact newContact = (NewContact) other;
        return Starred.m11706equalsimpl0(this.starred, newContact.starred) && Intrinsics.areEqual(this.modelsToInsert, newContact.modelsToInsert);
    }

    public int hashCode() {
        return (Starred.m11707hashCodeimpl(this.starred) * 31) + this.modelsToInsert.hashCode();
    }

    public String toString() {
        return "NewContact(starred=" + Starred.m11708toStringimpl(this.starred) + ", modelsToInsert=" + this.modelsToInsert + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NewContact(int i, List<? extends Insertable> modelsToInsert) {
        Intrinsics.checkNotNullParameter(modelsToInsert, "modelsToInsert");
        this.starred = i;
        this.modelsToInsert = modelsToInsert;
    }

    /* renamed from: getStarred-NmMWud4, reason: not valid java name */
    public final int m11676getStarredNmMWud4() {
        return this.starred;
    }

    public final List<Insertable> getModelsToInsert() {
        return this.modelsToInsert;
    }

    public final List<ContentProviderOperation> toInsertOperations() {
        List createListBuilder = CollectionsKt.createListBuilder();
        ContentProviderOperation build = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue(Columns.STARRED, Integer.valueOf(this.starred)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        createListBuilder.add(build);
        List<Insertable> list = this.modelsToInsert;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Insertable) it.next()).toInsertOperation());
        }
        createListBuilder.addAll(arrayList);
        return CollectionsKt.build(createListBuilder);
    }
}
