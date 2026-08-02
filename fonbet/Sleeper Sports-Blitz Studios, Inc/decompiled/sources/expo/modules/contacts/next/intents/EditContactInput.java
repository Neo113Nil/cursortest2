package expo.modules.contacts.next.intents;

import android.net.Uri;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditContactContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/intents/EditContactInput;", "Ljava/io/Serializable;", "lookupKeyUri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getLookupKeyUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EditContactInput implements Serializable {
    private final Uri lookupKeyUri;

    public static /* synthetic */ EditContactInput copy$default(EditContactInput editContactInput, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = editContactInput.lookupKeyUri;
        }
        return editContactInput.copy(uri);
    }

    /* renamed from: component1, reason: from getter */
    public final Uri getLookupKeyUri() {
        return this.lookupKeyUri;
    }

    public final EditContactInput copy(Uri lookupKeyUri) {
        Intrinsics.checkNotNullParameter(lookupKeyUri, "lookupKeyUri");
        return new EditContactInput(lookupKeyUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EditContactInput) && Intrinsics.areEqual(this.lookupKeyUri, ((EditContactInput) other).lookupKeyUri);
    }

    public int hashCode() {
        return this.lookupKeyUri.hashCode();
    }

    public String toString() {
        return "EditContactInput(lookupKeyUri=" + this.lookupKeyUri + ")";
    }

    public EditContactInput(Uri lookupKeyUri) {
        Intrinsics.checkNotNullParameter(lookupKeyUri, "lookupKeyUri");
        this.lookupKeyUri = lookupKeyUri;
    }

    public final Uri getLookupKeyUri() {
        return this.lookupKeyUri;
    }
}
