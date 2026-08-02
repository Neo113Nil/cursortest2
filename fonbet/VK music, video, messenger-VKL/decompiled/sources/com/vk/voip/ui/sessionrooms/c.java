package com.vk.voip.ui.sessionrooms;

import com.vk.voip.ui.sessionrooms.f;
import io.reactivex.rxjava3.core.x;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SessionRoomsController.kt */
/* loaded from: classes11.dex */
public interface c {
    x<Map<SessionRoomId.Room, Collection<SessionRoomParticipants.Participant>>> c();

    x<Collection<SessionRoomParticipants.Participant>> d(SessionRoomId.Room room);

    void e(f.a.b bVar);

    io.reactivex.rxjava3.core.a f(List<SessionRoomId.Room> list);

    void g();

    x<Collection<SessionRoomParticipants.Participant>> i();
}
