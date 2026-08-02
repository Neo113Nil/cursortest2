package com.vk.video.polls.nav;

import com.vk.dto.uxpolls.PollAnswer;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.nav.PollNavParams;
import java.util.Map;

/* compiled from: BuilderImpl.kt */
/* loaded from: classes6.dex */
public final class a implements PollNavParams.a {
    public UxPollEntryPoint a;
    public PollNavParams.Strategy b;
    public Map<Integer, PollAnswer> c;
    public int d;

    @Override // com.vk.video.polls.nav.PollNavParams.a
    public final a a(PollNavParams.Strategy strategy) {
        this.b = strategy;
        return this;
    }

    @Override // com.vk.video.polls.nav.PollNavParams.a
    public final a b(UxPollEntryPoint uxPollEntryPoint) {
        this.a = uxPollEntryPoint;
        return this;
    }

    public final PollNavParams c() {
        UxPollEntryPoint uxPollEntryPoint = this.a;
        if (uxPollEntryPoint != null) {
            return new PollNavParams(uxPollEntryPoint, this.b, this.c, this.d);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
