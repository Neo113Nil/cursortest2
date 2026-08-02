package ru.ozon.android.messenger.framework.data.local.database.draft;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.local.database.draft.b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.local.database.draft.DraftMessageDao$DefaultImpls", f = "DraftMessageDao.kt", l = {59, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "saveAttachmentsForDraft")
/* loaded from: classes10.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    b f87479d;

    /* renamed from: e, reason: collision with root package name */
    List f87480e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f87481f;

    /* renamed from: g, reason: collision with root package name */
    int f87482g;

    c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f87481f = obj;
        this.f87482g |= LinearLayoutManager.INVALID_OFFSET;
        return b.a.a(null, null, null, 0L, this);
    }
}
