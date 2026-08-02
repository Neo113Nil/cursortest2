package ru.ozon.tracker.db.entities;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/tracker/db/entities/UserEntity;", "", "id", "", "accessToken", "", "token", "abGroup", "", "regionId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "getId", "()J", "setId", "(J)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getToken", "setToken", "getAbGroup", "()Ljava/lang/Integer;", "setAbGroup", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRegionId", "()Ljava/lang/Long;", "setRegionId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserEntity {
    private Integer abGroup;
    private String accessToken;
    private long id;
    private Long regionId;
    private String token;

    public UserEntity() {
        this(0L, null, null, null, null, 31, null);
    }

    public final Integer getAbGroup() {
        return this.abGroup;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getRegionId() {
        return this.regionId;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setAbGroup(Integer num) {
        this.abGroup = num;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setId(long j11) {
        this.id = j11;
    }

    public final void setRegionId(Long l11) {
        this.regionId = l11;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public UserEntity(long j11, String str, String str2, Integer num, Long l11) {
        this.id = j11;
        this.accessToken = str;
        this.token = str2;
        this.abGroup = num;
        this.regionId = l11;
    }

    public /* synthetic */ UserEntity(long j11, String str, String str2, Integer num, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1L : j11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : l11);
    }
}
