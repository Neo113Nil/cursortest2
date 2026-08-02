package expo.modules.contacts.next.domain.model.email.operations;

import android.content.ContentProviderOperation;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.email.EmailLabel;
import expo.modules.contacts.next.domain.model.email.EmailModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppendableEmail.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/contacts/next/domain/model/email/operations/AppendableEmail;", "Lexpo/modules/contacts/next/domain/model/email/EmailModel;", "Lexpo/modules/contacts/next/domain/model/Appendable;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "address", "", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/email/EmailLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/email/EmailLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRawContactId-WW_a-ig", "()Ljava/lang/String;", "Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AppendableEmail extends EmailModel implements Appendable {
    private final String rawContactId;

    public /* synthetic */ AppendableEmail(String str, String str2, EmailLabel emailLabel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, emailLabel);
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
    private AppendableEmail(String rawContactId, String str, EmailLabel label) {
        super(str, label);
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.rawContactId = rawContactId;
    }
}
