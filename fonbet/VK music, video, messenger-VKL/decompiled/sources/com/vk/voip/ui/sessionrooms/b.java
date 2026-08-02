package com.vk.voip.ui.sessionrooms;

import androidx.fragment.app.FragmentManager;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vk.voip.ui.sessionrooms.f;
import io.reactivex.rxjava3.core.x;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomsController.kt */
/* loaded from: classes7.dex */
public final class b implements c {
    public final FragmentManager a;

    public b(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public static d a() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.B0;
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final x<Map<SessionRoomId.Room, Collection<SessionRoomParticipants.Participant>>> c() {
        return a().c();
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final x<Collection<SessionRoomParticipants.Participant>> d(SessionRoomId.Room room) {
        return a().d(room);
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final void e(f.a.b bVar) {
        a().e(bVar);
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final io.reactivex.rxjava3.core.a f(List<SessionRoomId.Room> list) {
        return a().f(list);
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final void g() {
        SessionRoomsDialog.a aVar = new SessionRoomsDialog.a();
        aVar.a = SessionRoomsDialog.DialogKind.CONFIRM_ADMIN_ASSISTANCE;
        aVar.a(this.a);
    }

    @Override // com.vk.voip.ui.sessionrooms.c
    public final x<Collection<SessionRoomParticipants.Participant>> i() {
        return a().i();
    }
}
