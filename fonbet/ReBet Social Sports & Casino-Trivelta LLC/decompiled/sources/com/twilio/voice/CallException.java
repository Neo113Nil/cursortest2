package com.twilio.voice;

/* loaded from: classes4.dex */
public class CallException extends VoiceException {
    public static final int EXCEPTION_INVALID_CALLER_ID = 13214;
    static final CallException InvalidCallerIdException = new CallException(EXCEPTION_INVALID_CALLER_ID, "Invalid callerId value", "CallerId must be the calling number, called number, or a validated outgoing number.");
    public static final int EXCEPTION_INVALID_PHONE_NUMBER = 13224;
    static final CallException InvalidPhoneNumberException = new CallException(EXCEPTION_INVALID_PHONE_NUMBER, "Invalid phone number", "Twilio does not support calling this number or the number is invalid.");
    public static final int EXCEPTION_INVALID_APPLICATION_SID = 21218;
    static final CallException CallTwiMLApplicationNotFoundException = new CallException(EXCEPTION_INVALID_APPLICATION_SID, "Invalid ApplicationSid", "The server was not able to find the TwiML application associated with the App SID.");
    public static final int EXCEPTION_CONNECTION_ERROR = 31005;
    static final CallException CallConnectionErrorException = new CallException(EXCEPTION_CONNECTION_ERROR, "Connection error", "A connection error occurred during the call.");
    public static final int EXCEPTION_CALL_CANCELLED = 31008;
    static final CallException CallCancelledException = new CallException(EXCEPTION_CALL_CANCELLED, "Call Canceled", "Unable to answer because the call has ended.");
    public static final int EXCEPTION_TRANSPORT_ERROR = 31009;
    static final CallException TransportErrorException = new CallException(EXCEPTION_TRANSPORT_ERROR, "Transport error", "No transport available to send or receive messages.");
    public static final int EXCEPTION_RATE_EXCEEDED_AUTHORIZED_LIMIT_ERROR = 31206;
    static final CallException RateExceededAuthorizedLimitException = new CallException(EXCEPTION_RATE_EXCEEDED_AUTHORIZED_LIMIT_ERROR, "Rate exceeded authorized limit", "Rate exceeded authorized limit.");
    public static final int EXCEPTION_CALL_MESSAGE_EVENT_PAYLOAD_SIZE_EXCEEDED_AUTHORIZED_LIMIT_ERROR = 31212;
    static final CallException CallMessageEventPayloadSizeExceededException = new CallException(EXCEPTION_CALL_MESSAGE_EVENT_PAYLOAD_SIZE_EXCEEDED_AUTHORIZED_LIMIT_ERROR, "Call message event payload size exceeded authorized limit.", "Call message event payload size exceeded authorized limit.");
    public static final int EXCEPTION_CALL_MESSAGE_EVENT_TYPE_INVALID = 31210;
    static final CallException CallMessageEventTypeInvalidException = new CallException(EXCEPTION_CALL_MESSAGE_EVENT_TYPE_INVALID, "Call message event type is invalid.", "Call message event type is invalid.");
    public static final int EXCEPTION_CALL_MESSAGE_CALL_IN_UNEXPECTED_STATE_ERROR = 31211;
    static final CallException CallMessageCallInUnexpectedStateException = new CallException(EXCEPTION_CALL_MESSAGE_CALL_IN_UNEXPECTED_STATE_ERROR, "Call is not in the expected state.", "Call is not in the expected state.");
    public static final int EXCEPTION_MALFORMED_REQUEST = 31100;
    static final CallException MalformedInvalidRequestException = new CallException(EXCEPTION_MALFORMED_REQUEST, "Malformed request", "The request could not be understood due to malformed syntax.");
    public static final int EXCEPTION_AUTHORIZATION_ERROR = 31201;
    static final CallException AuthorizationInvalidAccessTokenException = new CallException(EXCEPTION_AUTHORIZATION_ERROR, "Authorization error", "The request requires user authentication.The server understood the request, but is refusing to fulfill it.");
    public static final int EXCEPTION_TEMPORARILY_UNAVAILABLE_ERROR = 31480;
    static final CallException TemporarilyUnavailableException = new CallException(EXCEPTION_TEMPORARILY_UNAVAILABLE_ERROR, "Temporarily Unavailable", "The callee is currently unavailable");
    public static final int EXCEPTION_CALL_OR_TRANSACTION_DOES_NOT_EXIST_ERROR = 31481;
    static final CallException CallDoesNotExistException = new CallException(EXCEPTION_CALL_OR_TRANSACTION_DOES_NOT_EXIST_ERROR, "Call/Transaction Does Not Exist", "The call no longer exists.");
    public static final int EXCEPTION_ADDRESS_INCOMPLETE_ERROR = 31484;
    static final CallException AddressIncompleteException = new CallException(EXCEPTION_ADDRESS_INCOMPLETE_ERROR, "Address Incomplete", "The provided phone number is malformed.");
    public static final int EXCEPTION_BUSY_HERE_ERROR = 31486;
    static final CallException BusyHereException = new CallException(EXCEPTION_BUSY_HERE_ERROR, "Busy Here", "The callee is busy.");
    public static final int EXCEPTION_REQUEST_TERMINATED_ERROR = 31487;
    static final CallException RequestTerminatedException = new CallException(EXCEPTION_REQUEST_TERMINATED_ERROR, "Request Terminated", "The request has terminated as a result of a bye or cancel.");
    public static final int EXCEPTION_DNS_RESOLUTION = 31530;
    static final CallException DNSResolutionException = new CallException(EXCEPTION_DNS_RESOLUTION, "DNS Resolution Error", "Could not connect to the server.");
    public static final int EXCEPTION_BUSY_EVERYWHERE_ERROR = 31600;
    static final CallException BusyEverywhereException = new CallException(EXCEPTION_BUSY_EVERYWHERE_ERROR, "Busy Everywhere", "All possible destinations are busy.");
    public static final int EXCEPTION_DECLINE_ERROR = 31603;
    static final CallException DeclineException = new CallException(EXCEPTION_DECLINE_ERROR, "Decline", "The callee does not wish to participate in the call.");
    public static final int EXCEPTION_DOES_NOT_EXIST_ANYWHERE_ERROR = 31604;
    static final CallException DoesNotExistAnywhereException = new CallException(EXCEPTION_DOES_NOT_EXIST_ANYWHERE_ERROR, "Does Not Exist Anywhere", "The requested callee does not exist anywhere.");
    public static final int EXCEPTION_SIGNALING_CONNECTION_DISCONNECTED = 53001;
    static final CallException SignalingConnectionDisconnectedErrorCode = new CallException(EXCEPTION_SIGNALING_CONNECTION_DISCONNECTED, "Signaling connection disconnected", "Raised whenever the signaling connection is unexpectedly disconnected.");
    public static final int EXCEPTION_CLIENT_LOCAL_MEDIA_DESCRIPTION = 53400;
    static final CallException MediaClientLocalDescFailedErrorCode = new CallException(EXCEPTION_CLIENT_LOCAL_MEDIA_DESCRIPTION, "Client is unable to create or apply a local media description", "Raised whenever a Client is unable to create or apply a local media description.");
    public static final int EXCEPTION_SERVER_LOCAL_MEDIA_DESCRIPTION = 53401;
    static final CallException MediaServerLocalDescFailedErrorCode = new CallException(EXCEPTION_SERVER_LOCAL_MEDIA_DESCRIPTION, "Server is unable to create or apply a local media description", "Raised whenever the Server is unable to create or apply a local media description");
    public static final int EXCEPTION_CLIENT_REMOTE_MEDIA_DESCRIPTION = 53402;
    static final CallException MediaClientRemoteDescFailedErrorCode = new CallException(EXCEPTION_CLIENT_REMOTE_MEDIA_DESCRIPTION, "Client is unable to apply a remote media description", "Raised whenever the Client receives a remote media description but is unable to apply it");
    public static final int EXCEPTION_SERVER_REMOTE_MEDIA_DESCRIPTION = 53403;
    static final CallException MediaServerRemoteDescFailedErrorCode = new CallException(EXCEPTION_SERVER_REMOTE_MEDIA_DESCRIPTION, "Server is unable to apply a remote media description", "Raised whenever the Server receives a remote media description but is unable to apply it");
    public static final int EXCEPTION_NO_SUPPORTED_CODEC = 53404;
    static final CallException MediaNoSupportedCodecErrorCode = new CallException(EXCEPTION_NO_SUPPORTED_CODEC, "No supported code", "Raised whenever the intersection of codecs supported by the Client and the Server (or, in peer-to-peer, the Client and another Participant) is empty.");
    public static final int EXCEPTION_MEDIA_CONNECTION_FAILED = 53405;
    static final CallException MediaConnectionErrorCode = new CallException(EXCEPTION_MEDIA_CONNECTION_FAILED, "Media connection failed", "Raised by the Client or Server whenever a media connection fails.");
    public static final int EXCEPTION_MEDIA_DTLS_TRANSPORT_FAILED = 53407;
    static final CallException MediaDTLSTransportErrorCode = new CallException(EXCEPTION_MEDIA_DTLS_TRANSPORT_FAILED, "The media connection failed due to DTLS handshake failure", "There was a problem while negotiating with the remote DTLS peer. Therefore the Client will not be able to establish the media connection.");

    public CallException(int i10, String str, String str2) {
        super(i10, str, str2);
    }
}
