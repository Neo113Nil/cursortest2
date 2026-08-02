package ru.ozon.android.messenger.blocks.useristyping;

import com.squareup.moshi.j;
import kotlin.Metadata;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/messenger/blocks/useristyping/UserIsTypingDTO;", "", "animationId", "", "<init>", "(Ljava/lang/String;)V", "getAnimationId", "()Ljava/lang/String;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UserIsTypingDTO {
    public static final int $stable = 0;
    private final String animationId;

    public UserIsTypingDTO(String str) {
        this.animationId = str;
    }

    public final String getAnimationId() {
        return this.animationId;
    }
}
