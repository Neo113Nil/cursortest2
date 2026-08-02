package com.vk.im.notification.settings.impl;

import com.vk.api.generated.account.dto.AccountSetInfoNameDto;
import com.vk.im.engine.models.dialogs.FolderType;
import io.reactivex.rxjava3.internal.operators.completable.p;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.Set;
import xsna.b25;
import xsna.bv5;
import xsna.byr;
import xsna.ceb;
import xsna.es;
import xsna.fl40;
import xsna.g0s;
import xsna.ig70;
import xsna.jg70;
import xsna.le50;
import xsna.rl3;
import xsna.rsg0;
import xsna.y84;
import xsna.yfb;

/* compiled from: NotificationSettingsInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class a implements ig70 {
    public static final Set<FolderType> e = rl3.y0(new FolderType[]{FolderType.CHANNELS, FolderType.MANAGED_GROUPS});
    public final y84 a;
    public final g0s b;
    public final b25 c;
    public final byr d;

    public a(y84 y84Var, g0s g0sVar, b25 b25Var, byr byrVar) {
        this.a = y84Var;
        this.b = g0sVar;
        this.c = b25Var;
        this.d = byrVar;
    }

    @Override // xsna.ig70
    public final w a(boolean z) {
        FolderType.Companion.getClass();
        FolderType a = FolderType.b.a(null);
        if (e.contains(a)) {
            return this.d.b(a, z).g(new jg70(a, z, 0));
        }
        throw new IllegalArgumentException("Forbidden folder type provided");
    }

    @Override // xsna.ig70
    public final p b(boolean z) {
        return new p(new o(new r(rsg0.W(yfb.x(new es().g(AccountSetInfoNameDto.MESSAGES_COUNTER_SETTINGS_INCLUDE_MUTTED, z ? "1" : "0")), 7), new fl40(new bv5(this, z, 2), 2)), new le50(new ceb(this, z, 1), 3)));
    }
}
