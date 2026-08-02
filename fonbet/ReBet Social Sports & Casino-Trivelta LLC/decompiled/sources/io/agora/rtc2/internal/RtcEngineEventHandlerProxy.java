package io.agora.rtc2.internal;

import io.agora.rtc2.ClientRoleOptions;
import io.agora.rtc2.Constants;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.UserInfo;
import io.agora.rtc2.internal.RtcEngineEvent;
import io.agora.rtc2.internal.RtcEngineMessage;
import java.io.UnsupportedEncodingException;
import org.bouncycastle.i18n.LocalizedMessage;

/* loaded from: classes3.dex */
public class RtcEngineEventHandlerProxy {
    private IRtcEngineEventHandler mHandler;

    public RtcEngineEventHandlerProxy(IRtcEngineEventHandler iRtcEngineEventHandler) {
        this.mHandler = iRtcEngineEventHandler;
    }

    public IRtcEngineEventHandler getHandler() {
        return this.mHandler;
    }

    public void handleEvent(int i10, byte[] bArr) {
        IRtcEngineEventHandler iRtcEngineEventHandler = this.mHandler;
        if (iRtcEngineEventHandler == null) {
            return;
        }
        if (i10 == 100) {
            try {
                new String(bArr, LocalizedMessage.DEFAULT_ENCODING);
                return;
            } catch (UnsupportedEncodingException unused) {
                return;
            }
        }
        if (i10 == 101) {
            RtcEngineMessage.PError pError = new RtcEngineMessage.PError();
            pError.unmarshall(bArr);
            this.mHandler.onError(pError.err);
            return;
        }
        if (i10 == 1108) {
            iRtcEngineEventHandler.onRequestToken();
            return;
        }
        if (i10 == 1109) {
            RtcEngineMessage.PClientRoleChanged pClientRoleChanged = new RtcEngineMessage.PClientRoleChanged();
            pClientRoleChanged.unmarshall(bArr);
            ClientRoleOptions clientRoleOptions = new ClientRoleOptions();
            clientRoleOptions.audienceLatencyLevel = pClientRoleChanged.newRoleLatencyLevel;
            this.mHandler.onClientRoleChanged(pClientRoleChanged.oldRole, pClientRoleChanged.newRole, clientRoleOptions);
            return;
        }
        if (i10 == 1117) {
            RtcEngineMessage.PPrivilegeWillExpire pPrivilegeWillExpire = new RtcEngineMessage.PPrivilegeWillExpire();
            pPrivilegeWillExpire.unmarshall(bArr);
            this.mHandler.onTokenPrivilegeWillExpire(pPrivilegeWillExpire.token);
            return;
        }
        if (i10 == 1118) {
            RtcEngineMessage.PLocalVideoState pLocalVideoState = new RtcEngineMessage.PLocalVideoState();
            pLocalVideoState.unmarshall(bArr);
            this.mHandler.onLocalVideoStateChanged(Constants.VideoSourceType.fromInt(pLocalVideoState.source), pLocalVideoState.state, pLocalVideoState.errorCode);
            return;
        }
        switch (i10) {
            case RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS /* 1002 */:
                iRtcEngineEventHandler.onMediaEngineLoadSuccess();
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_QUALITY /* 1102 */:
                RtcEngineMessage.PMediaResAudioQuality pMediaResAudioQuality = new RtcEngineMessage.PMediaResAudioQuality();
                pMediaResAudioQuality.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler2 = this.mHandler;
                if (iRtcEngineEventHandler2 != null) {
                    iRtcEngineEventHandler2.onAudioQuality(pMediaResAudioQuality.uid, pMediaResAudioQuality.quality, pMediaResAudioQuality.delay, pMediaResAudioQuality.lost);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_EVENT /* 1104 */:
                RtcEngineMessage.PMediaEngineEvent pMediaEngineEvent = new RtcEngineMessage.PMediaEngineEvent();
                pMediaEngineEvent.unmarshall(bArr);
                if (pMediaEngineEvent.code == 10) {
                    this.mHandler.onAudioMixingFinished();
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LIVE_TRANSCODING /* 1112 */:
                iRtcEngineEventHandler.onTranscodingUpdated();
                break;
            case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
                RtcEngineMessage.PMediaResJoinMedia pMediaResJoinMedia = new RtcEngineMessage.PMediaResJoinMedia();
                pMediaResJoinMedia.unmarshall(bArr);
                if (pMediaResJoinMedia.firstSuccess) {
                    IRtcEngineEventHandler iRtcEngineEventHandler3 = this.mHandler;
                    if (iRtcEngineEventHandler3 != null) {
                        iRtcEngineEventHandler3.onJoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                        break;
                    }
                } else {
                    IRtcEngineEventHandler iRtcEngineEventHandler4 = this.mHandler;
                    if (iRtcEngineEventHandler4 != null) {
                        iRtcEngineEventHandler4.onRejoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                        break;
                    }
                }
                break;
            case RtcEngineEvent.EvtType.EVT_RTC_STATS /* 13010 */:
                RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats = new RtcEngineMessage.PMediaResRtcStats();
                pMediaResRtcStats.unmarshall(bArr);
                this.mHandler.onRtcStats(pMediaResRtcStats.getRtcStats());
                break;
            case RtcEngineEvent.EvtType.EVT_USER_JOINED /* 13013 */:
                RtcEngineMessage.PMediaResUserJoinedEvent pMediaResUserJoinedEvent = new RtcEngineMessage.PMediaResUserJoinedEvent();
                pMediaResUserJoinedEvent.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler5 = this.mHandler;
                if (iRtcEngineEventHandler5 != null) {
                    iRtcEngineEventHandler5.onUserJoined(pMediaResUserJoinedEvent.uid, pMediaResUserJoinedEvent.elapsed);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_USER_MUTE_AUDIO /* 13014 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler6 = this.mHandler;
                if (iRtcEngineEventHandler6 != null) {
                    iRtcEngineEventHandler6.onUserMuteAudio(pMediaResUserState.uid, pMediaResUserState.state);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_USER_MUTE_VIDEO /* 13015 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState2 = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState2.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler7 = this.mHandler;
                if (iRtcEngineEventHandler7 != null) {
                    iRtcEngineEventHandler7.onUserMuteVideo(pMediaResUserState2.uid, pMediaResUserState2.state);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_USER_ENABLE_VIDEO /* 13016 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState3 = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState3.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler8 = this.mHandler;
                if (iRtcEngineEventHandler8 != null) {
                    iRtcEngineEventHandler8.onUserEnableVideo(pMediaResUserState3.uid, pMediaResUserState3.state);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LASTMILE_QUALITY /* 13017 */:
                RtcEngineMessage.PMediaResLastmileQuality pMediaResLastmileQuality = new RtcEngineMessage.PMediaResLastmileQuality();
                pMediaResLastmileQuality.unmarshall(bArr);
                this.mHandler.onLastmileQuality(pMediaResLastmileQuality.quality);
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_EFFECT_FINISHED /* 13018 */:
                RtcEngineMessage.PMediaResAudioEffectFinished pMediaResAudioEffectFinished = new RtcEngineMessage.PMediaResAudioEffectFinished();
                pMediaResAudioEffectFinished.unmarshall(bArr);
                this.mHandler.onAudioEffectFinished(pMediaResAudioEffectFinished.soundId);
                break;
            case RtcEngineEvent.EvtType.EVT_USER_ENABLE_LOCAL_VIDEO /* 13019 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState4 = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState4.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler9 = this.mHandler;
                if (iRtcEngineEventHandler9 != null) {
                    iRtcEngineEventHandler9.onUserEnableLocalVideo(pMediaResUserState4.uid, pMediaResUserState4.state);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LASTMILE_PROBE_RESULT /* 13020 */:
                RtcEngineMessage.PMediaResLastmileProbeResult pMediaResLastmileProbeResult = new RtcEngineMessage.PMediaResLastmileProbeResult();
                pMediaResLastmileProbeResult.unmarshall(bArr);
                this.mHandler.onLastmileProbeResult(pMediaResLastmileProbeResult.getLastmileProbeResult());
                break;
            case RtcEngineEvent.EvtType.EVT_UPLINK_NETWORK_INFO_UPDATE /* 13021 */:
                RtcEngineMessage.PUplinkNetworkInfoUpdated pUplinkNetworkInfoUpdated = new RtcEngineMessage.PUplinkNetworkInfoUpdated();
                pUplinkNetworkInfoUpdated.unmarshall(bArr);
                this.mHandler.onUplinkNetworkInfoUpdated(pUplinkNetworkInfoUpdated.getUplinkNetworkInfo());
                break;
            case RtcEngineEvent.EvtType.EVT_USER_STATE_CHANGED /* 13023 */:
                RtcEngineMessage.PUserStateChanged pUserStateChanged = new RtcEngineMessage.PUserStateChanged();
                pUserStateChanged.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler10 = this.mHandler;
                if (iRtcEngineEventHandler10 != null) {
                    iRtcEngineEventHandler10.onUserStateChanged(pUserStateChanged.uid, pUserStateChanged.state);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_CONNECTION_BANNED /* 14019 */:
                iRtcEngineEventHandler.onConnectionBanned();
                break;
            case RtcEngineEvent.EvtType.EVT_CAMERA_FOCUS_AREA_CHANGED /* 14020 */:
                RtcEngineMessage.PCameraFocusAreaChanged pCameraFocusAreaChanged = new RtcEngineMessage.PCameraFocusAreaChanged();
                pCameraFocusAreaChanged.unmarshall(bArr);
                this.mHandler.onCameraFocusAreaChanged(pCameraFocusAreaChanged.getRect());
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STATE_CHANGED /* 14021 */:
                RtcEngineMessage.PRemoteVideoState pRemoteVideoState = new RtcEngineMessage.PRemoteVideoState();
                pRemoteVideoState.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler11 = this.mHandler;
                if (iRtcEngineEventHandler11 != null) {
                    iRtcEngineEventHandler11.onRemoteVideoStateChanged(pRemoteVideoState.uid, pRemoteVideoState.state, pRemoteVideoState.reason, pRemoteVideoState.elapsed);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_SUBSCRIBE_FALLBACK_TO_AUDIO_ONLY /* 14023 */:
                RtcEngineMessage.PMediaResUserState pMediaResUserState5 = new RtcEngineMessage.PMediaResUserState();
                pMediaResUserState5.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler12 = this.mHandler;
                if (iRtcEngineEventHandler12 != null) {
                    iRtcEngineEventHandler12.onRemoteSubscribeFallbackToAudioOnly(pMediaResUserState5.uid, pMediaResUserState5.state);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_USER_TRANSPORT_STAT /* 14024 */:
                RtcEngineMessage.PUserTransportStat pUserTransportStat = new RtcEngineMessage.PUserTransportStat();
                pUserTransportStat.unmarshall(bArr);
                if (pUserTransportStat.isAudio) {
                    IRtcEngineEventHandler iRtcEngineEventHandler13 = this.mHandler;
                    if (iRtcEngineEventHandler13 != null) {
                        iRtcEngineEventHandler13.onRemoteAudioTransportStats(pUserTransportStat.peerUid, pUserTransportStat.delay, pUserTransportStat.lost, pUserTransportStat.rxKBitRate);
                        break;
                    }
                } else {
                    IRtcEngineEventHandler iRtcEngineEventHandler14 = this.mHandler;
                    if (iRtcEngineEventHandler14 != null) {
                        iRtcEngineEventHandler14.onRemoteVideoTransportStats(pUserTransportStat.peerUid, pUserTransportStat.delay, pUserTransportStat.lost, pUserTransportStat.rxKBitRate);
                        break;
                    }
                }
                break;
            case 14028:
                RtcEngineMessage.PConnectionState pConnectionState = new RtcEngineMessage.PConnectionState();
                pConnectionState.unmarshall(bArr);
                this.mHandler.onConnectionStateChanged(pConnectionState.state, pConnectionState.reason);
                break;
            case RtcEngineEvent.EvtType.EVT_CAMERA_EXPOSURE_AREA_CHANGED /* 14029 */:
                RtcEngineMessage.PCameraExposureAreaChanged pCameraExposureAreaChanged = new RtcEngineMessage.PCameraExposureAreaChanged();
                pCameraExposureAreaChanged.unmarshall(bArr);
                this.mHandler.onCameraExposureAreaChanged(pCameraExposureAreaChanged.getRect());
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STAT /* 14030 */:
                RtcEngineMessage.PRemoteAudioStat pRemoteAudioStat = new RtcEngineMessage.PRemoteAudioStat();
                pRemoteAudioStat.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler15 = this.mHandler;
                if (iRtcEngineEventHandler15 != null) {
                    IRtcEngineEventHandler.RemoteAudioStats remoteAudioStats = pRemoteAudioStat.stats;
                    if (remoteAudioStats.uid != 0) {
                        iRtcEngineEventHandler15.onRemoteAudioStats(remoteAudioStats);
                        break;
                    }
                }
                break;
            case RtcEngineEvent.EvtType.EVT_NETWORK_TYPE_CHANGED /* 14031 */:
                RtcEngineMessage.PNetworkTypeChanged pNetworkTypeChanged = new RtcEngineMessage.PNetworkTypeChanged();
                pNetworkTypeChanged.unmarshall(bArr);
                this.mHandler.onNetworkTypeChanged(pNetworkTypeChanged.type);
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_ROUTING_CHANGED /* 14032 */:
                RtcEngineMessage.PAudioRoutingChanged pAudioRoutingChanged = new RtcEngineMessage.PAudioRoutingChanged();
                pAudioRoutingChanged.unmarshall(bArr);
                this.mHandler.onAudioRouteChanged(pAudioRoutingChanged.routing);
                break;
            case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_AUDIO_DECODED /* 14033 */:
                RtcEngineMessage.PFirstRemoteAudioDecoded pFirstRemoteAudioDecoded = new RtcEngineMessage.PFirstRemoteAudioDecoded();
                pFirstRemoteAudioDecoded.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler16 = this.mHandler;
                if (iRtcEngineEventHandler16 != null) {
                    iRtcEngineEventHandler16.onFirstRemoteAudioDecoded(pFirstRemoteAudioDecoded.uid, pFirstRemoteAudioDecoded.elapsed);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LOCAL_USER_REGISTERED /* 14034 */:
                RtcEngineMessage.PUserInfoState pUserInfoState = new RtcEngineMessage.PUserInfoState();
                pUserInfoState.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler17 = this.mHandler;
                if (iRtcEngineEventHandler17 != null) {
                    iRtcEngineEventHandler17.onLocalUserRegistered(pUserInfoState.uid, pUserInfoState.userAccount);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_USER_INFO_UPDATED /* 14035 */:
                RtcEngineMessage.PUserInfoState pUserInfoState2 = new RtcEngineMessage.PUserInfoState();
                pUserInfoState2.unmarshall(bArr);
                UserInfo userInfo = new UserInfo(pUserInfoState2.uid, pUserInfoState2.userAccount);
                IRtcEngineEventHandler iRtcEngineEventHandler18 = this.mHandler;
                if (iRtcEngineEventHandler18 != null) {
                    iRtcEngineEventHandler18.onUserInfoUpdated(pUserInfoState2.uid, userInfo);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_CROSS_CHANNEL_STATE /* 14037 */:
                RtcEngineMessage.PCrossChannelState pCrossChannelState = new RtcEngineMessage.PCrossChannelState();
                pCrossChannelState.unmarshall(bArr);
                this.mHandler.onChannelMediaRelayStateChanged(pCrossChannelState.state, pCrossChannelState.code);
                break;
            case RtcEngineEvent.EvtType.EVT_REMOTE_AUDIO_STATE_CHANGED /* 14040 */:
                RtcEngineMessage.PRemoteAudioState pRemoteAudioState = new RtcEngineMessage.PRemoteAudioState();
                pRemoteAudioState.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler19 = this.mHandler;
                if (iRtcEngineEventHandler19 != null) {
                    iRtcEngineEventHandler19.onRemoteAudioStateChanged(pRemoteAudioState.uid, pRemoteAudioState.state, pRemoteAudioState.reason, pRemoteAudioState.elapsed);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LOCAL_AUDIO_STAT /* 14041 */:
                RtcEngineMessage.PLocalAudioStat pLocalAudioStat = new RtcEngineMessage.PLocalAudioStat();
                pLocalAudioStat.unmarshall(bArr);
                this.mHandler.onLocalAudioStats(pLocalAudioStat.stats);
                break;
            case RtcEngineEvent.EvtType.EVT_LOCAL_AUDIO_STATE_CHANGED /* 14042 */:
                RtcEngineMessage.PLocalAudioState pLocalAudioState = new RtcEngineMessage.PLocalAudioState();
                pLocalAudioState.unmarshall(bArr);
                this.mHandler.onLocalAudioStateChanged(pLocalAudioState.state, pLocalAudioState.errorCode);
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_MIXING_STATE_CHANGED /* 14043 */:
                RtcEngineMessage.PAudioMixingStateChanged pAudioMixingStateChanged = new RtcEngineMessage.PAudioMixingStateChanged();
                pAudioMixingStateChanged.unmarshall(bArr);
                this.mHandler.onAudioMixingStateChanged(pAudioMixingStateChanged.state, pAudioMixingStateChanged.reasonCode);
                if (pAudioMixingStateChanged.state == 713) {
                    this.mHandler.onAudioMixingFinished();
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_INTRA_REQUEST_RECEIVED /* 14044 */:
                iRtcEngineEventHandler.onIntraRequestReceived();
                break;
            case RtcEngineEvent.EvtType.EVT_ENCRYPTION_ERROR /* 14046 */:
                RtcEngineMessage.PEncryptionError pEncryptionError = new RtcEngineMessage.PEncryptionError();
                pEncryptionError.unmarshall(bArr);
                this.mHandler.onEncryptionError(pEncryptionError.errorType);
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_SUBSCRIBE_STATE_CHANGED /* 14048 */:
                RtcEngineMessage.PSubscribeAudioStateChanged pSubscribeAudioStateChanged = new RtcEngineMessage.PSubscribeAudioStateChanged();
                pSubscribeAudioStateChanged.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler20 = this.mHandler;
                if (iRtcEngineEventHandler20 != null) {
                    iRtcEngineEventHandler20.onAudioSubscribeStateChanged(pSubscribeAudioStateChanged.channelId, pSubscribeAudioStateChanged.uid, pSubscribeAudioStateChanged.oldState, pSubscribeAudioStateChanged.newState, pSubscribeAudioStateChanged.elapseSinceLastState);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_VIDEO_SUBSCRIBE_STATE_CHANGED /* 14049 */:
                RtcEngineMessage.PSubscribeVideoStateChanged pSubscribeVideoStateChanged = new RtcEngineMessage.PSubscribeVideoStateChanged();
                pSubscribeVideoStateChanged.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler21 = this.mHandler;
                if (iRtcEngineEventHandler21 != null) {
                    iRtcEngineEventHandler21.onVideoSubscribeStateChanged(pSubscribeVideoStateChanged.channelId, pSubscribeVideoStateChanged.uid, pSubscribeVideoStateChanged.oldState, pSubscribeVideoStateChanged.newState, pSubscribeVideoStateChanged.elapseSinceLastState);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_PUBLISH_STATE_CHANGED /* 14050 */:
                RtcEngineMessage.PPublishAudioStateChanged pPublishAudioStateChanged = new RtcEngineMessage.PPublishAudioStateChanged();
                pPublishAudioStateChanged.unmarshall(bArr);
                this.mHandler.onAudioPublishStateChanged(pPublishAudioStateChanged.channelId, pPublishAudioStateChanged.oldState, pPublishAudioStateChanged.newState, pPublishAudioStateChanged.elapseSinceLastState);
                break;
            case RtcEngineEvent.EvtType.EVT_VIDEO_PUBLISH_STATE_CHANGED /* 14051 */:
                RtcEngineMessage.PPublishVideoStateChanged pPublishVideoStateChanged = new RtcEngineMessage.PPublishVideoStateChanged();
                pPublishVideoStateChanged.unmarshall(bArr);
                this.mHandler.onVideoPublishStateChanged(Constants.VideoSourceType.fromInt(pPublishVideoStateChanged.source), pPublishVideoStateChanged.channelId, pPublishVideoStateChanged.oldState, pPublishVideoStateChanged.newState, pPublishVideoStateChanged.elapseSinceLastState);
                break;
            case RtcEngineEvent.EvtType.EVT_PERMISSION_ERROR /* 14052 */:
                RtcEngineMessage.PPermissionError pPermissionError = new RtcEngineMessage.PPermissionError();
                pPermissionError.unmarshall(bArr);
                this.mHandler.onPermissionError(pPermissionError.permission);
                break;
            case RtcEngineEvent.EvtType.EVT_FACE_DETECT_VALUE /* 14053 */:
                RtcEngineMessage.PFacePositionChanged pFacePositionChanged = new RtcEngineMessage.PFacePositionChanged();
                pFacePositionChanged.unmarshall(bArr);
                this.mHandler.onFacePositionChanged(pFacePositionChanged.imageWidth, pFacePositionChanged.imageHeight, pFacePositionChanged.getAgoraFacePositionInfo());
                break;
            case RtcEngineEvent.EvtType.EVT_RHYTHM_PLAYFR_STATE_CHANGED /* 14054 */:
                RtcEngineMessage.PRhythmPlayerStateChanged pRhythmPlayerStateChanged = new RtcEngineMessage.PRhythmPlayerStateChanged();
                pRhythmPlayerStateChanged.unmarshall(bArr);
                this.mHandler.onRhythmPlayerStateChanged(pRhythmPlayerStateChanged.state, pRhythmPlayerStateChanged.errorCode);
                break;
            case RtcEngineEvent.EvtType.EVT_UPLOAD_LOG_RESULT /* 14055 */:
                RtcEngineMessage.PUploadLogResult pUploadLogResult = new RtcEngineMessage.PUploadLogResult();
                pUploadLogResult.unmarshall(bArr);
                this.mHandler.onUploadLogResult(pUploadLogResult.requestId, pUploadLogResult.success, pUploadLogResult.reason);
                break;
            case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_AUDIO_FRAME /* 14058 */:
                RtcEngineMessage.PFirstRemoteAudioFrame pFirstRemoteAudioFrame = new RtcEngineMessage.PFirstRemoteAudioFrame();
                pFirstRemoteAudioFrame.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler22 = this.mHandler;
                if (iRtcEngineEventHandler22 != null) {
                    iRtcEngineEventHandler22.onFirstRemoteAudioFrame(pFirstRemoteAudioFrame.uid, pFirstRemoteAudioFrame.elapsed);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_PROXY_CONNECTED /* 14059 */:
                RtcEngineMessage.PProxyConnect pProxyConnect = new RtcEngineMessage.PProxyConnect();
                pProxyConnect.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler23 = this.mHandler;
                if (iRtcEngineEventHandler23 != null) {
                    iRtcEngineEventHandler23.onProxyConnected(pProxyConnect.channel, pProxyConnect.uid, pProxyConnect.proxyType, pProxyConnect.localProxyIp, pProxyConnect.elapsed);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_SNAPSHOT_TAKEN_VALUE /* 14062 */:
                RtcEngineMessage.PSnapshotTaken pSnapshotTaken = new RtcEngineMessage.PSnapshotTaken();
                pSnapshotTaken.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler24 = this.mHandler;
                if (iRtcEngineEventHandler24 != null) {
                    iRtcEngineEventHandler24.onSnapshotTaken(pSnapshotTaken.uid, pSnapshotTaken.filepath, pSnapshotTaken.width, pSnapshotTaken.height, pSnapshotTaken.errCode);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_CONTENT_INSPECT_RESULT_VALUE /* 14063 */:
                RtcEngineMessage.PContentInspectResult pContentInspectResult = new RtcEngineMessage.PContentInspectResult();
                pContentInspectResult.unmarshall(bArr);
                this.mHandler.onContentInspectResult(pContentInspectResult.result);
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_MIXING_POSITION_CHANGED /* 14064 */:
                RtcEngineMessage.PAudioMixingPositionChanged pAudioMixingPositionChanged = new RtcEngineMessage.PAudioMixingPositionChanged();
                pAudioMixingPositionChanged.unmarshall(bArr);
                this.mHandler.onAudioMixingPositionChanged(pAudioMixingPositionChanged.position);
                break;
            case RtcEngineEvent.EvtType.EVT_LICENSE_VERIFY /* 14065 */:
                RtcEngineMessage.PLicenseVerifyFailed pLicenseVerifyFailed = new RtcEngineMessage.PLicenseVerifyFailed();
                pLicenseVerifyFailed.unmarshall(bArr);
                this.mHandler.onLicenseValidationFailure(pLicenseVerifyFailed.reason);
                break;
            case RtcEngineEvent.EvtType.EVT_VIDEO_RENDERING_TRACING_RESULT /* 14066 */:
                RtcEngineMessage.PVideoRenderingTracingInfo pVideoRenderingTracingInfo = new RtcEngineMessage.PVideoRenderingTracingInfo();
                pVideoRenderingTracingInfo.unmarshall(bArr);
                IRtcEngineEventHandler.VideoRenderingTracingInfo videoRenderingTracingInfo = pVideoRenderingTracingInfo.getVideoRenderingTracingInfo();
                Constants.MEDIA_TRACE_EVENT fromInt = Constants.MEDIA_TRACE_EVENT.fromInt(pVideoRenderingTracingInfo.event);
                IRtcEngineEventHandler iRtcEngineEventHandler25 = this.mHandler;
                if (iRtcEngineEventHandler25 != null) {
                    iRtcEngineEventHandler25.onVideoRenderingTracingResult(pVideoRenderingTracingInfo.uid, fromInt, videoRenderingTracingInfo);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_LOCAL_TRANSCODING /* 14067 */:
                RtcEngineMessage.PTranscodingVideoStream pTranscodingVideoStream = new RtcEngineMessage.PTranscodingVideoStream();
                pTranscodingVideoStream.unmarshall(bArr);
                IRtcEngineEventHandler iRtcEngineEventHandler26 = this.mHandler;
                if (iRtcEngineEventHandler26 != null) {
                    iRtcEngineEventHandler26.onLocalVideoTranscoderError(pTranscodingVideoStream.getTranscodingVideoStream(), pTranscodingVideoStream.error);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_VIDEO_LAYOUT_INFO /* 14069 */:
                RtcEngineMessage.PVideoLayoutInfo pVideoLayoutInfo = new RtcEngineMessage.PVideoLayoutInfo();
                pVideoLayoutInfo.unmarshall(bArr);
                IRtcEngineEventHandler.VideoLayoutInfo videoLayoutInfo = new IRtcEngineEventHandler.VideoLayoutInfo();
                videoLayoutInfo.width = pVideoLayoutInfo.width;
                videoLayoutInfo.height = pVideoLayoutInfo.height;
                int i11 = pVideoLayoutInfo.layoutCount;
                videoLayoutInfo.layoutCount = i11;
                if (i11 > 0) {
                    videoLayoutInfo.layoutList = new IRtcEngineEventHandler.VideoLayout[i11];
                    for (int i12 = 0; i12 < videoLayoutInfo.layoutCount; i12++) {
                        videoLayoutInfo.layoutList[i12] = new IRtcEngineEventHandler.VideoLayout();
                        IRtcEngineEventHandler.VideoLayout videoLayout = videoLayoutInfo.layoutList[i12];
                        RtcEngineMessage.PVideoLayoutInfo.Layout layout = pVideoLayoutInfo.layoutList[i12];
                        videoLayout.channelId = layout.channel;
                        videoLayout.uid = layout.uid;
                        videoLayout.f49162x = layout.f49174x;
                        videoLayout.f49163y = layout.f49175y;
                        videoLayout.width = layout.width;
                        videoLayout.height = layout.height;
                        videoLayout.videoState = layout.videoState;
                    }
                }
                IRtcEngineEventHandler iRtcEngineEventHandler27 = this.mHandler;
                if (iRtcEngineEventHandler27 != null) {
                    iRtcEngineEventHandler27.onTranscodedStreamLayoutInfo(pVideoLayoutInfo.uid, videoLayoutInfo);
                    break;
                }
                break;
            case RtcEngineEvent.EvtType.EVT_AUDIO_METADATA_RECEIVED /* 14070 */:
                RtcEngineMessage.PAudioMetadataReceived pAudioMetadataReceived = new RtcEngineMessage.PAudioMetadataReceived();
                pAudioMetadataReceived.unmarshall(bArr);
                this.mHandler.onAudioMetadataReceived(pAudioMetadataReceived.uid, pAudioMetadataReceived.payload);
                break;
            case RtcEngineEvent.EvtType.EVT_RDT_MESSAGE /* 14071 */:
                RtcEngineMessage.PRdtMessage pRdtMessage = new RtcEngineMessage.PRdtMessage();
                pRdtMessage.unmarshall(bArr);
                this.mHandler.onRdtMessage(pRdtMessage.uid, pRdtMessage.type, pRdtMessage.payload);
                break;
            case RtcEngineEvent.EvtType.EVT_RDT_STATE_CHANGED /* 14072 */:
                RtcEngineMessage.PRdtStateChanged pRdtStateChanged = new RtcEngineMessage.PRdtStateChanged();
                pRdtStateChanged.unmarshall(bArr);
                this.mHandler.onRdtStateChanged(pRdtStateChanged.uid, pRdtStateChanged.state);
                break;
            case RtcEngineEvent.EvtType.EVT_MEDIA_CONTROL_MESSAGE /* 14073 */:
                RtcEngineMessage.PMediaControlMessage pMediaControlMessage = new RtcEngineMessage.PMediaControlMessage();
                pMediaControlMessage.unmarshall(bArr);
                this.mHandler.onMediaControlMessage(pMediaControlMessage.uid, pMediaControlMessage.payload);
                break;
            case RtcEngineEvent.EvtType.EVT_PATH_STATS /* 14074 */:
                RtcEngineMessage.PMultipathStats pMultipathStats = new RtcEngineMessage.PMultipathStats();
                pMultipathStats.unmarshall(bArr);
                this.mHandler.onMultipathStats(pMultipathStats.getMultipathStats());
                break;
            case RtcEngineEvent.EvtType.EVT_PERMISSION_GRANTED /* 14075 */:
                RtcEngineMessage.PPermissionGranted pPermissionGranted = new RtcEngineMessage.PPermissionGranted();
                pPermissionGranted.unmarshall(bArr);
                this.mHandler.onPermissionGranted(pPermissionGranted.permission);
                break;
            default:
                switch (i10) {
                    case 1005:
                        iRtcEngineEventHandler.onCameraReady();
                        break;
                    case RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_START_CALL_SUCCESS /* 1006 */:
                        iRtcEngineEventHandler.onMediaEngineStartCallSuccess();
                        break;
                    case RtcEngineEvent.EvtType.EVT_VIDEO_STOPPED /* 1007 */:
                        iRtcEngineEventHandler.onVideoStopped();
                        break;
                    default:
                        switch (i10) {
                            case RtcEngineEvent.EvtType.EVT_PUBLISH_STREAM_STATE /* 1120 */:
                                RtcEngineMessage.PStreamPublishState pStreamPublishState = new RtcEngineMessage.PStreamPublishState();
                                pStreamPublishState.unmarshall(bArr);
                                this.mHandler.onRtmpStreamingStateChanged(pStreamPublishState.url, pStreamPublishState.state, pStreamPublishState.error);
                                break;
                            case RtcEngineEvent.EvtType.EVT_CLIENT_ROLE_CHANGE_FAILED /* 1121 */:
                                RtcEngineMessage.PClientRoleChangeFailed pClientRoleChangeFailed = new RtcEngineMessage.PClientRoleChangeFailed();
                                pClientRoleChangeFailed.unmarshall(bArr);
                                this.mHandler.onClientRoleChangeFailed(pClientRoleChangeFailed.reason, pClientRoleChangeFailed.currentRole);
                                break;
                            case RtcEngineEvent.EvtType.EVT_PUBLISH_STREAM_EVENT /* 1122 */:
                                RtcEngineMessage.PStreamPublishEvent pStreamPublishEvent = new RtcEngineMessage.PStreamPublishEvent();
                                pStreamPublishEvent.unmarshall(bArr);
                                this.mHandler.onRtmpStreamingEvent(pStreamPublishEvent.url, pStreamPublishEvent.event);
                                break;
                            case RtcEngineEvent.EvtType.EVT_RENEW_TOKEN_RES /* 1123 */:
                                RtcEngineMessage.PRenewTokenRes pRenewTokenRes = new RtcEngineMessage.PRenewTokenRes();
                                pRenewTokenRes.unmarshall(bArr);
                                this.mHandler.onRenewTokenResult(pRenewTokenRes.token, Constants.RenewTokenErrorCode.fromInt(pRenewTokenRes.code));
                                break;
                            case RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_EVENT /* 1124 */:
                                RtcEngineMessage.PLocalVideoEvent pLocalVideoEvent = new RtcEngineMessage.PLocalVideoEvent();
                                pLocalVideoEvent.unmarshall(bArr);
                                this.mHandler.onLocalVideoEvent(Constants.VideoSourceType.fromInt(pLocalVideoEvent.source), pLocalVideoEvent.event);
                                break;
                            default:
                                switch (i10) {
                                    case RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL /* 13006 */:
                                        RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats2 = new RtcEngineMessage.PMediaResRtcStats();
                                        pMediaResRtcStats2.unmarshall(bArr);
                                        this.mHandler.onLeaveChannel(pMediaResRtcStats2.getRtcStats());
                                        break;
                                    case RtcEngineEvent.EvtType.EVT_NETWORK_QUALITY /* 13007 */:
                                        RtcEngineMessage.PMediaResNetworkQuality pMediaResNetworkQuality = new RtcEngineMessage.PMediaResNetworkQuality();
                                        pMediaResNetworkQuality.unmarshall(bArr);
                                        IRtcEngineEventHandler iRtcEngineEventHandler28 = this.mHandler;
                                        if (iRtcEngineEventHandler28 != null) {
                                            iRtcEngineEventHandler28.onNetworkQuality(pMediaResNetworkQuality.uid, pMediaResNetworkQuality.txQuality, pMediaResNetworkQuality.rxQuality);
                                            break;
                                        }
                                        break;
                                    case RtcEngineEvent.EvtType.EVT_USER_OFFLINE /* 13008 */:
                                        RtcEngineMessage.PMediaResUserOfflineEvent pMediaResUserOfflineEvent = new RtcEngineMessage.PMediaResUserOfflineEvent();
                                        pMediaResUserOfflineEvent.unmarshall(bArr);
                                        IRtcEngineEventHandler iRtcEngineEventHandler29 = this.mHandler;
                                        if (iRtcEngineEventHandler29 != null) {
                                            iRtcEngineEventHandler29.onUserOffline(pMediaResUserOfflineEvent.uid, pMediaResUserOfflineEvent.reason);
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (i10) {
                                            case RtcEngineEvent.EvtType.EVT_AUDIO_VOLUME_INDICATION /* 14001 */:
                                                RtcEngineMessage.PMediaResSpeakersReport pMediaResSpeakersReport = new RtcEngineMessage.PMediaResSpeakersReport();
                                                pMediaResSpeakersReport.unmarshall(bArr);
                                                IRtcEngineEventHandler iRtcEngineEventHandler30 = this.mHandler;
                                                if (iRtcEngineEventHandler30 != null) {
                                                    iRtcEngineEventHandler30.onAudioVolumeIndication(pMediaResSpeakersReport.getAudioVolumeInfo(), pMediaResSpeakersReport.mixVolume);
                                                    break;
                                                }
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_FRAME /* 14002 */:
                                                RtcEngineMessage.PFirstRemoteVideoFrame pFirstRemoteVideoFrame = new RtcEngineMessage.PFirstRemoteVideoFrame();
                                                pFirstRemoteVideoFrame.unmarshall(bArr);
                                                IRtcEngineEventHandler iRtcEngineEventHandler31 = this.mHandler;
                                                if (iRtcEngineEventHandler31 != null) {
                                                    iRtcEngineEventHandler31.onFirstRemoteVideoFrame(pFirstRemoteVideoFrame.uid, pFirstRemoteVideoFrame.width, pFirstRemoteVideoFrame.height, pFirstRemoteVideoFrame.elapsed);
                                                    break;
                                                }
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_LOCAL_VIDEO_STAT /* 14003 */:
                                                RtcEngineMessage.PLocalVideoStat pLocalVideoStat = new RtcEngineMessage.PLocalVideoStat();
                                                pLocalVideoStat.unmarshall(bArr);
                                                IRtcEngineEventHandler iRtcEngineEventHandler32 = this.mHandler;
                                                if (iRtcEngineEventHandler32 != null) {
                                                    iRtcEngineEventHandler32.onLocalVideoStats(Constants.VideoSourceType.fromInt(pLocalVideoStat.source), pLocalVideoStat.stats);
                                                    break;
                                                }
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_REMOTE_VIDEO_STAT /* 14004 */:
                                                RtcEngineMessage.PRemoteVideoStat pRemoteVideoStat = new RtcEngineMessage.PRemoteVideoStat();
                                                pRemoteVideoStat.unmarshall(bArr);
                                                IRtcEngineEventHandler iRtcEngineEventHandler33 = this.mHandler;
                                                if (iRtcEngineEventHandler33 != null) {
                                                    iRtcEngineEventHandler33.onRemoteVideoStats(pRemoteVideoStat.stats);
                                                    break;
                                                }
                                                break;
                                            case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME /* 14005 */:
                                                RtcEngineMessage.PFirstLocalVideoFrame pFirstLocalVideoFrame = new RtcEngineMessage.PFirstLocalVideoFrame();
                                                pFirstLocalVideoFrame.unmarshall(bArr);
                                                this.mHandler.onFirstLocalVideoFrame(Constants.VideoSourceType.fromInt(pFirstLocalVideoFrame.source), pFirstLocalVideoFrame.width, pFirstLocalVideoFrame.height, pFirstLocalVideoFrame.elapsed);
                                                break;
                                            default:
                                                switch (i10) {
                                                    case RtcEngineEvent.EvtType.EVT_FIRST_REMOTE_VIDEO_DECODED /* 14007 */:
                                                        RtcEngineMessage.PFirstRemoteVideoDecoded pFirstRemoteVideoDecoded = new RtcEngineMessage.PFirstRemoteVideoDecoded();
                                                        pFirstRemoteVideoDecoded.unmarshall(bArr);
                                                        IRtcEngineEventHandler iRtcEngineEventHandler34 = this.mHandler;
                                                        if (iRtcEngineEventHandler34 != null) {
                                                            iRtcEngineEventHandler34.onFirstRemoteVideoDecoded(pFirstRemoteVideoDecoded.uid, pFirstRemoteVideoDecoded.width, pFirstRemoteVideoDecoded.height, pFirstRemoteVideoDecoded.elapsed);
                                                            break;
                                                        }
                                                        break;
                                                    case RtcEngineEvent.EvtType.EVT_CONNECTION_LOST /* 14008 */:
                                                        iRtcEngineEventHandler.onConnectionLost();
                                                        break;
                                                    case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE /* 14009 */:
                                                        RtcEngineMessage.PStreamMessage pStreamMessage = new RtcEngineMessage.PStreamMessage();
                                                        pStreamMessage.unmarshall(bArr);
                                                        IRtcEngineEventHandler iRtcEngineEventHandler35 = this.mHandler;
                                                        if (iRtcEngineEventHandler35 != null) {
                                                            iRtcEngineEventHandler35.onStreamMessage(pStreamMessage.uid, pStreamMessage.streamId, pStreamMessage.payload);
                                                            break;
                                                        }
                                                        break;
                                                    case RtcEngineEvent.EvtType.EVT_CONNECTION_INTERRUPTED /* 14010 */:
                                                        iRtcEngineEventHandler.onConnectionInterrupted();
                                                        break;
                                                    default:
                                                        switch (i10) {
                                                            case RtcEngineEvent.EvtType.EVT_STREAM_MESSAGE_ERROR /* 14012 */:
                                                                RtcEngineMessage.PStreamMessageError pStreamMessageError = new RtcEngineMessage.PStreamMessageError();
                                                                pStreamMessageError.unmarshall(bArr);
                                                                IRtcEngineEventHandler iRtcEngineEventHandler36 = this.mHandler;
                                                                if (iRtcEngineEventHandler36 != null) {
                                                                    iRtcEngineEventHandler36.onStreamMessageError(pStreamMessageError.uid, pStreamMessageError.streamId, pStreamMessageError.error, pStreamMessageError.missed, pStreamMessageError.cached);
                                                                    break;
                                                                }
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_VIDEO_SIZE_CHANGED /* 14013 */:
                                                                RtcEngineMessage.PVideoSizeChanged pVideoSizeChanged = new RtcEngineMessage.PVideoSizeChanged();
                                                                pVideoSizeChanged.unmarshall(bArr);
                                                                IRtcEngineEventHandler iRtcEngineEventHandler37 = this.mHandler;
                                                                if (iRtcEngineEventHandler37 != null) {
                                                                    iRtcEngineEventHandler37.onVideoSizeChanged(Constants.VideoSourceType.fromInt(pVideoSizeChanged.source), pVideoSizeChanged.uid, pVideoSizeChanged.width, pVideoSizeChanged.height, pVideoSizeChanged.rotation);
                                                                    break;
                                                                }
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_AUDIO_FRAME_PUBLISHED /* 14014 */:
                                                                RtcEngineMessage.PFirstLocalAudioFrame pFirstLocalAudioFrame = new RtcEngineMessage.PFirstLocalAudioFrame();
                                                                pFirstLocalAudioFrame.unmarshall(bArr);
                                                                this.mHandler.onFirstLocalAudioFramePublished(pFirstLocalAudioFrame.elapsed);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_FIRST_LOCAL_VIDEO_FRAME_PUBLISHED /* 14015 */:
                                                                RtcEngineMessage.PFirstLocalVideoFramePublished pFirstLocalVideoFramePublished = new RtcEngineMessage.PFirstLocalVideoFramePublished();
                                                                pFirstLocalVideoFramePublished.unmarshall(bArr);
                                                                this.mHandler.onFirstLocalVideoFramePublished(Constants.VideoSourceType.fromInt(pFirstLocalVideoFramePublished.source), pFirstLocalVideoFramePublished.elapsed);
                                                                break;
                                                            case RtcEngineEvent.EvtType.EVT_ACTIVE_SPEAKER /* 14016 */:
                                                                RtcEngineMessage.PActiveSpeaker pActiveSpeaker = new RtcEngineMessage.PActiveSpeaker();
                                                                pActiveSpeaker.unmarshall(bArr);
                                                                IRtcEngineEventHandler iRtcEngineEventHandler38 = this.mHandler;
                                                                if (iRtcEngineEventHandler38 != null) {
                                                                    iRtcEngineEventHandler38.onActiveSpeaker(pActiveSpeaker.uid);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
